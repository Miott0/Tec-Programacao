package Pilha;
public class Pilha<T> implements InterfacePilha{

    private No topo = null;

    @Override
    public void push(Object dado) {
        No novoNo = new No(dado);
		novoNo.setProximo(this.topo);
		this.topo = novoNo;
        
    }

    @Override
    public Object pop() {
        T dado = (T) this.topo.getDado();
		this.topo = this.topo.getProximo();
		return dado;
    }

    @Override
    public boolean vazio() {
        return this.topo == null;
    }

    @Override
    public Object getTop() {
        return this.topo.getDado();
    }

    @Override
	public String toString() {
		String elementos = new String();
		No noAtual = this.topo;
		while(noAtual != null) {
			elementos = elementos + noAtual.getDado() + " ";
			noAtual = noAtual.getProximo();
		}
		return "Pilha encadeada	[ " + elementos + "]";
	}
 
   
}