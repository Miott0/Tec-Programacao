package Numero1;
import java.util.Scanner;

public class Teste {

	
  public static void main(String[] args) {
    Pilha pilhaOriginal = new Pilha();
	Pilha pilhaPar = new Pilha();
	Pilha pilhaImpar = new Pilha();

	int i;
	for (i = 0 ; i < 20; i++) {
		pilhaOriginal.push(i);
   	}

	for(int j = 0; j < i; j++){
		int x = pilhaOriginal.pop();
		if (x % 2 == 0) {
			pilhaPar.push(x);
		}else{
			pilhaImpar.push(x);
		}
	}

	System.out.println("Pilha Original" +pilhaOriginal.toString());
	System.out.println("Pilha Par" + pilhaPar.toString());
	System.out.println("Pilha Impar" +pilhaImpar.toString());

  }
}
