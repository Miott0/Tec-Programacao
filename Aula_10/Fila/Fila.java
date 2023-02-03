package Fila;

import Pilha.No;

public class Fila implements InterfaceFila {

	private No inicio = null;

    @Override
    public void enqueue(Object dado) {
        No novoNo = new No(dado);
		No noAtual = this.inicio;
		if (this.inicio != null) {
			while (noAtual.getProximo() != null) {
				noAtual = noAtual.getProximo();
			}
			noAtual.setProximo(novoNo);
		} else {
			this.inicio = novoNo;
		}
		
        
    }

    @Override
    public boolean dequeue() {
        if (this.inicio != null) {
			this.inicio = this.inicio.getProximo();
			return true;
		}
		return false;
	}
    

    @Override
    public boolean vazio() {
        return this.inicio == null;
    }

    @Override
    public Object front() {
        return this.inicio.getDado();
    }
    @Override
	public String toString() {
		String elementos = new String();
		No noAtual = this.inicio;
		while(noAtual != null) {
			elementos = elementos + noAtual.getDado() + " ";
			noAtual = noAtual.getProximo();
		}
		return "Pilha encadeada	[ " + elementos + "]";
	}
	


}
