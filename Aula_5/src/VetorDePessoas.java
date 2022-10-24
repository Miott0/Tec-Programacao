package src;

public class VetorDePessoas implements ColecaoPessoas {
    Pessoa vetorPessoa[];
    int totalDePessoas;


    
    public VetorDePessoas(){
        this.vetorPessoa = new Pessoa[1095379];
        this.totalDePessoas = 0 ;

    }


    public VetorDePessoas(int tamanhoVetor){
        this.vetorPessoa = new Pessoa[tamanhoVetor];
        this.totalDePessoas = 0 ;
    }

    @Override
    public void AdicionarPessoa(Pessoa pessoa){
        vetorPessoa[totalDePessoas] = pessoa;
        totalDePessoas ++;
    }

    @Override
    public Pessoa ObterPessoa(int indicePessoa){
        return vetorPessoa[indicePessoa];
    }

    @Override
    public int ObterTotalDePessoas(){
        return totalDePessoas;
    }


    @Override
    public boolean ExcluirPessoa() {
        if (this.totalDePessoas > 0) {
			this.totalDePessoas--;
			return true;
		}
		return false;
    }

    @Override
    public void IncluirPessoa(int indicePessoa, Pessoa pessoa) {
        if ((indicePessoa >= 0 && indicePessoa < this.vetorPessoa.length)){
            for(int posicao = this.totalDePessoas; posicao >= indicePessoa; posicao-- ){
               this.vetorPessoa[posicao+1] = this.vetorPessoa[posicao];
            }
            this.vetorPessoa[indicePessoa] = pessoa;
            this.totalDePessoas++;
            
        }
    }


    @Override
    public boolean ExcluirPessoaPorPosicao(int indicePessoa) {
        if ((indicePessoa >= 0 && indicePessoa < this.vetorPessoa.length)){
            for(int posicao = indicePessoa; posicao < this.totalDePessoas - 1; posicao++ ){
                this.vetorPessoa[posicao] = this.vetorPessoa[posicao+1];
            }
            this.totalDePessoas--;
            return true;
            
        }
        return false;
    }


    public int BuscaPessoa(String n){
        int posicao;
        for( posicao = 0; posicao  < totalDePessoas; posicao ++){
            String nome = this.vetorPessoa[posicao].getNome();
            if(n.equals(nome)){
                return posicao;
            }
        }
        
        return -1;
    } 


    @Override
    public void organizarPessoaPorBubbleSort(){
        int tamanho = this.totalDePessoas;
		for(int i = 0; i < tamanho; i++){
			boolean controle = true;
			for(int j = 0; j < (tamanho -1); j++){
                if(this.vetorPessoa[j].getDataNas() > this.vetorPessoa[j + 1].getDataNas() ){
                    Pessoa auxiliar  = this.vetorPessoa[j];
                    this.vetorPessoa[j] = this.vetorPessoa[j+1];
                    this.vetorPessoa[j+1] = auxiliar; 
                    controle = false;
                }
				
			}
            if(controle)
            break;
		}
    }

    @Override 
    public void organizarPessoaPorSelectionSort(){
        int tamanho = this.totalDePessoas;
        Pessoa auxiliar ;

        for(int i = 0; i < tamanho; i++){
            int menorAno = i;
            for(int j = i + 1; j < tamanho; j++){
                if(this.vetorPessoa[j].getDataNas() < this.vetorPessoa[menorAno].getDataNas()){
                    menorAno = j;
                }

            }
            auxiliar = this.vetorPessoa[menorAno];
            this.vetorPessoa[menorAno] = this.vetorPessoa[i];
            this.vetorPessoa[i] = auxiliar;
        }
    }

    @Override
    public void organizarPessoaPorInsertionSort(){

        int tamanho = this.totalDePessoas;
        int j;
        Pessoa auxiliar;

        for(int i = 1; i < tamanho; i++ ){
            auxiliar = this.vetorPessoa[i];
            j = i -1;
            while (j >= 0 && this.vetorPessoa[j].getDataNas() > auxiliar.getDataNas()) {
                this.vetorPessoa[j+1] = this.vetorPessoa[j];
                j--;
            }
            this.vetorPessoa[j+1] = auxiliar;
        } 
    }

   


}
