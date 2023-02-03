package Pilha;
public class No<T>{
    private T dado;
    private No proximo = null;


    public No(){

    }

    public No(T dado){
        this.dado = dado;
        this.proximo = null;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }


}
