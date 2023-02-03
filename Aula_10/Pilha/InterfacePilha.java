package Pilha;
public interface InterfacePilha<T> {
    public void push(T dado);
    public T pop();
    public boolean vazio();
    public T getTop();

    @Override
    public String toString();

}
