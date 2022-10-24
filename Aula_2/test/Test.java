package test;
import src.Pessoa;
import src.TratamentoDados;



public class Test {
    public static void main(String[] args) {
       
        TratamentoDados e = new TratamentoDados();

        
        e.EscreverNoArquivo(e.LerDoArquivo());
        
        



        
    }
}
