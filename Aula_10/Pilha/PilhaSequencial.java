package Pilha;
public class PilhaSequencial<T> implements InterfacePilha{
    int contador = 0;
	T[] vetorN = (T[])new Object[20];
    @Override
    public void push(Object dado) {
        if (contador < 20) {
			vetorN[this.contador] = (T) dado;
			this.contador++;
		}

        
    }

    @Override
    public Object pop() {
        vetorN[this.contador - 1] = null;
		contador--;
		return vetorN[this.contador - 1];
    }

    @Override
    public boolean vazio() {
        if (vetorN[0] != null) {
			return false;
		}
		return true;
    }

    @Override
    public Object getTop() {
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
