import java.util.Scanner;

public class InverterPalavraRecursao {
   

    private static String Inverter(String palavra){
        if (palavra.length() == 0){
            return palavra;
        } 
        return Inverter(palavra.substring(1)) + palavra.charAt(0);
    }

    
    public static String InverterPalavra( String vet[], int posicaoDaLetra){
		String palavraInvertida = "";
		if (posicaoDaLetra < 0) {
			return palavraInvertida;
		}	
		
		palavraInvertida = vet[posicaoDaLetra];
		palavraInvertida = palavraInvertida + InverterPalavra(vet,posicaoDaLetra - 1);
		return palavraInvertida;
	}

   
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
		System.out.print("Digite a palavra para inverter: ");
		String palavra = entradaTeclado.next();
		int tamanhoDaPalavra = palavra.length();
		String vetor[] = new String [tamanhoDaPalavra];
		

		for (int i = 0; i < tamanhoDaPalavra; i++) {
			vetor[i] = Character.toString(palavra.charAt(i));
		}
		
		System.out.println("Primeiro metodo\n" +InverterPalavra(vetor, tamanhoDaPalavra-1));

        System.out.println("Segundo metodo\n" + Inverter(palavra));

	}
}