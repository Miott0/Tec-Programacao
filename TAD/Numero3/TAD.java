package Numero3;

public interface TAD {

	public void enqueue(int dado);
	
	public boolean dequeue();
	
	public boolean vazio();
	
	public int front();
	
	@Override
	public String toString();
	
	
}
