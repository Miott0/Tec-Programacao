package Numero1;

public class Pilha implements TAD {
	
	No topo = null;

	@Override
	public void push(int dado) {
		No novoNo = new No(dado);
		novoNo.setProximo(this.topo);
		this.topo = novoNo;
	}

	@Override
	public int pop() {
		int dado = this.topo.getDado();
		this.topo = this.topo.getProximo();
		return dado;
	}
	
	@Override
	public int getTop() {
		return this.topo.getDado();
	}

	@Override
	public boolean vazio() {
		return this.topo == null;
	}
	
	@Override
	public String toString() {
		String elementos = new String();
		No noAtual = this.topo;
		while(noAtual != null) {
			elementos = elementos + noAtual.getDado() + " ";
			noAtual = noAtual.getProximo();
		}
		return "[ " + elementos + "]";
	}

}
