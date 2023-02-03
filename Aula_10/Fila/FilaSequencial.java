package Fila;

import Pilha.No;

public class FilaSequencial<T>implements InterfaceFila{

	private int contador = 0;
	private int contadorFila = 0;
	private No topo = null;
	private T[] vetorN = (T[])new Object[20];


    @Override
    public void enqueue(Object dado) {
        if (contador < 20) {
			vetorN[this.contador] = (T) dado;
			this.contador++;
		}
        
    }
    @Override
    public boolean dequeue() {
        vetorN[contadorFila] = null;
		this.contadorFila++;
		return true;
    }
    @Override
    public boolean vazio() {
        if (vetorN[this.contadorFila] != null) {
			return false;
		}
		return true;
    }
    @Override
    public Object front() {
        return vetorN[this.contadorFila];
    }

	@Override
	public String toString() {
		String elementos = new String();
		for (int i = this.contadorFila; i < this.contador; i++) {
			elementos = elementos + vetorN[i] + " ";
		}
		return "Pilha encadeada	[ " + elementos + "]";
	}

}
