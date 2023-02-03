package src;

public class ListaEncadeadaPessoas implements ColecaoPessoas {

    No inicio = null;
	int numeroDePessoas = 0;


    /*
        Aqui serve para adicionar a pessoa na estrutura de dados
        o noAtual serve como um apontador, dizendo onde vai ser a posicao
        que o proximo elemento add vai entrar.
        Nesse caso ai acho que sempre vai add no final. Nao lembro bem. 
    */

    @Override
    public void AdicionarPessoa(Pessoa pessoa) {
        No novoNo = new No(pessoa);
		No noAtual = this.inicio;

		if (this.inicio != null) {              // Checa se ja existe algum elemento add
			
            while (noAtual.proximo != null) {  // Caso exista algum, o laco percorre ate encontrar o ultimo elemento da lista 
				noAtual = noAtual.proximo;
			}
			noAtual.proximo = novoNo; //aqui add no final do laco
		} else {
			this.inicio = novoNo; //aqui tambem add, mas so se nao entrar no laco 
		}
		numeroDePessoas++;
        
    }

    /*
        Obter elemento atraves passado a posicao que ele se encontra.
        Faz um laco que vai repetir enquanto ainda existirem elentos 
        e ate encontrar achar a posicao procurada.
        Quando a lista acabar e posicao encontrada, retorna o elemento
    */
    @Override
    public Pessoa ObterPessoa(int indicePessoa) {
        No noAtual = this.inicio;
		int posicaoAtual = 0;
		
		if (this.inicio != null) {
			while ((noAtual != null) && (indicePessoa != posicaoAtual)) {
				noAtual = noAtual.proximo;
				posicaoAtual++;
			}
			
			return noAtual.dado;
	
		}
		return null;
    }


    @Override
    public int ObterTotalDePessoas() {
        return numeroDePessoas;
    }


    /* 
        Exlui o ulitmo elemento da lista
        funciona como o de adicionar, so que no final ele exlcui
     */

    @Override
    public boolean ExcluirPessoa() {
        No noAtual = this.inicio;
		No noAnterior = null;

		if (this.inicio != null) {
			while (noAtual.proximo != null) {
				noAnterior = noAtual;
				noAtual = noAtual.proximo;
			}
			if (noAnterior != null) {
				noAnterior.proximo = null;
			} else {
				this.inicio = null;
			}
            numeroDePessoas--;
			return true;
		}
		return false;
    }

    /* 
        Add o elemento na posicao desejada, passando o 
        elemento e a posicao.

        Cria um laco que que funcionara ate que a posicao desejada seja econtrada 
        e add o elemento na posicao.
     */
    @Override
    public void IncluirPessoa(int indicePessoa, Pessoa pessoa) {
        No novoNo = new No(pessoa);
        No noAtual = this.inicio;
        No noAnterior = null;
        int posicaoAtual = 0;

        while ((noAtual != null) && (indicePessoa != posicaoAtual)) {
            noAnterior = noAtual;
            noAtual = noAtual.proximo;
            posicaoAtual++;
        }

        if (indicePessoa == posicaoAtual) {
            if (noAnterior == null) {
                novoNo.proximo = this.inicio;
                this.inicio = novoNo;
            }
            else {
                noAnterior.proximo = novoNo;
                novoNo.proximo = noAtual;
            }
        }      
    }


    /*
     O mesmo que o de cima mas exlui
     */
    @Override
    public boolean ExcluirPessoaPorPosicao(int indicePessoa) {
        No noAtual = this.inicio;
        No noAnterior = null;
        int posicaoAtual = 0;

        if (this.inicio != null) {
            while ((noAtual.proximo != null) && (indicePessoa != posicaoAtual)) {
                noAnterior = noAtual;
                noAtual = noAtual.proximo;
                posicaoAtual++;
            }
            if (indicePessoa == posicaoAtual) {
                if (noAnterior == null) {
                    this.inicio = noAtual.proximo;
                }
                else {
                    noAnterior.proximo = noAtual.proximo;
                }
                numeroDePessoas--;
                return true;
            }
        }
        return false;
    }
    

    /*
        Faz uma busca pela lista atras do elemento, onde usa o nome 
        como parametro de busca 
     */
    @Override
    public int BuscaPessoa(String n) {
        No noAtual = this.inicio;
        int posicaoAtual = 0;
        while ((noAtual != null)) {
            if(n.equals(noAtual.dado.getNome())){                   
                return posicaoAtual;
            }
            noAtual = noAtual.proximo;
            posicaoAtual++;
            }
        return -1;
    }

    @Override
    public void OrdenarLista(Ordenador ordenador) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void TrocarPosicoesEntreDuasPessoas(int i, int j) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void AlterarPessoa(int posicaoDaPessoa, Pessoa novaPessoa) {
        // TODO Auto-generated method stub
        
    }

}