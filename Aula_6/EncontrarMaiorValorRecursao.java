public class EncontrarMaiorValorRecursao {
    
    private static int BuscaMaior(int numeros[], int tamanho, int indice){ 
        if(tamanho == 0 ){
            return numeros[indice];
        }
        else if(numeros[tamanho -1] > numeros[indice]){
            return BuscaMaior(numeros, tamanho -1, tamanho -1);
        }
        else{
            return BuscaMaior(numeros, tamanho -1, indice);
        }
    }
    
    
    public static void main(String[] args) {
        int numeros [] = {0, 6, 8, 97, 45,3,56,58};
        int tamanho = numeros.length;
        int indice = 0; 
        System.out.println(BuscaMaior(numeros, tamanho, indice));
    }
}

