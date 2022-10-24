package src;

public class VetorDePessoas {
    Pessoa vetorPessoa[];
    int posPessoa;


    
    public VetorDePessoas(){
        this.vetorPessoa = new Pessoa[1094379];
        this.posPessoa = 0 ;

    }


    public VetorDePessoas(int tamanhoVetor){
        this.vetorPessoa = new Pessoa[tamanhoVetor];
        this.posPessoa = 0 ;
    }


    public void AdicionaPessoa(Pessoa pessoa){
        vetorPessoa[posPessoa] = pessoa;
        posPessoa ++;
        
        

    }

    public Pessoa ObterPessoa(int n){
       
        return vetorPessoa[n];
    }


    public int TotaldePessoa(){
        return posPessoa;
    }
}
