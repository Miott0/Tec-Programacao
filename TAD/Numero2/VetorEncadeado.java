package Numero2;

import Numero1.TAD;

public class VetorEncadeado implements TAD {

	int contador = 0;
	int vetorN[] = new int[20];

	@Override
	public void push(int dado) {
		if (contador < 20) {
			vetorN[this.contador] = dado;
			this.contador++;
		}

	}

	@Override
	public int pop() {
		vetorN[this.contador - 1] = 0;
		contador--;
		return vetorN[this.contador - 1];
	}

	@Override
	public boolean vazio() {
		if (vetorN[0] != 0) {
			return false;
		}
		return true;
	}

	@Override
	public int getTop() {
		return vetorN[this.contador - 1];
	}

	@Override
	public String toString() {
		String elementos = new String();
		for (int i = 0; i < this.contador; i++) {
			elementos = elementos + vetorN[i] + " ";
		}
		return "Pilha encadeada	[ " + elementos + "]";
	}

}
