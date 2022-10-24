public class SomaRecursao {
    
    
    private static int SomaRecursao(int x[], int tamanho){
        if(tamanho == 0){
            return 0;
        } 

        return x[tamanho - 1] + SomaRecursao(x, tamanho - 1);
    }
 
    
    public static void main(String[] args) {
        
        int numeros [] = {2,7};
        int tamanho = numeros.length;

        System.out.println(SomaRecursao(numeros, tamanho));
    }


    
}
