package Fila;

public interface InterfaceFila<T> {
    public void enqueue(T dado);
	
	public boolean dequeue();
	
	public boolean vazio();
	
	public T front();
	
	@Override
	public String toString();
	
}
