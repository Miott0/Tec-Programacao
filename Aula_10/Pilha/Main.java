package Pilha;

public class Main {
    public static void main(String[] args) {
		InterfacePilha pilha ;

		pilha = new Pilha<>();
        /* pilha = new PilhaSequencial<>(); */

		
		for(int i = 0; i < 10; i++) {		
			pilha.push(i);
		}
		
		System.out.println(pilha);
		pilha.pop();

		
		for(int i = 0; i < 1; i++) {
			System.out.println(pilha.getTop());
		}
		
		System.out.println(pilha.vazio());
		System.out.println(pilha);
	}
}
