package Fila;

public class Main {
    public static void main(String[] args) {
		InterfaceFila fila;
		
		/* fila = new Fila(); */
        fila = new FilaSequencial();
		
		for(int i = 0; i < 10; i++) {		
			fila.enqueue(i+1);
		}
		System.out.println(fila);
		fila.dequeue();
		for(int i = 0; i < 1; i++) {
			System.out.println(fila.front());
		}
		
		System.out.println(fila.vazio());
		System.out.println(fila);
	}
}
