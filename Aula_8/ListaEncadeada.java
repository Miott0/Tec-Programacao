public class ListaEncadeada {

    private No inicio;

    public void adiciona(String elemento){
        No novoNo = new No(elemento);
        novoNo.setProximo(this.inicio);
        this.inicio = novoNo;
       
        
    }

    public void adicionaFinalLista(String elemento){
        No novoNo = new No(elemento);
        No noaAtual = this.inicio;

        if(this.inicio != null){
            while (noaAtual.getProximo() != null) {
                noaAtual = noaAtual.getProximo();
            }
            noaAtual.setProximo(novoNo);
        }
        else {
            this.inicio = novoNo;
        }
        
        
    }

    public boolean exlcuirInicio(){
        if(this.inicio.getProximo() == null){
            return false;

        }
        this.inicio = this.inicio.getProximo();
        return true;

    }

    public boolean exlcuirFim(){
        No noAtual = this.inicio;
        No noAnterior = null;
        
        if(this.inicio != null){
            while (noAtual.getProximo() != null) {
                noAnterior = noAtual;
                noAtual = noAtual.getProximo();
            }
            if(noAnterior!=null){
                noAnterior.setProximo(null);
            }else{
                this.inicio = this.inicio.getProximo();
            }
            return true;
        }
        return false;
    }

    public No obterNo(){
        No aux = inicio;
        return aux;
    }

    public String toString() {
		String elementos = new String();
		No noAtual = this.inicio;
		while (noAtual != null) {
			elementos = elementos + noAtual.getElemento() + " "; 
			noAtual = noAtual.getProximo();
		}
		return "ListaEncadeada [ "+ elementos + "]";
	}

}

