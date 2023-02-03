package Numero2;

public class Teste2 {

	public static void main(String[] args) {
		
		VetorEncadeado vetor = new VetorEncadeado();
		
		for(int i = 0; i < 20; i++) {		
			vetor.push(i+1);
		}
				
		System.out.println(vetor);
		
		vetor.pop();	

		System.out.println(vetor.getTop());
		
		System.out.println(vetor.vazio());	
		
		System.out.println(vetor);

	}

}
