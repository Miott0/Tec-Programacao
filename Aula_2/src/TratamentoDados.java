package src;
import src.Pessoa;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class TratamentoDados {

    private Pessoa vetorPessoa[] = new Pessoa[30];
    private int indice = 0;



    private Pessoa criarObjetoJogo(String linhaLidaDoArquivo) {
		String nomePessoa, descricao, genero, pais, ocupacao;
		String anoNascimento, anoMorte;
		String camposDoArquivo[];
        
		
		camposDoArquivo = linhaLidaDoArquivo.split(",");
        nomePessoa = camposDoArquivo[1];
		descricao = camposDoArquivo[2];
		genero = camposDoArquivo[3];
        pais = camposDoArquivo[4];
        ocupacao = camposDoArquivo[5];
        anoNascimento = camposDoArquivo[6];
        anoMorte = camposDoArquivo[7];
		return new Pessoa(nomePessoa, descricao, genero, pais, ocupacao, anoNascimento, anoMorte);
	}

    
    public Pessoa[] LerDoArquivo(){
        FileReader arquivoDeEntrada = null;
		BufferedReader leituraBufferizada;
		String linhaLidaDoArquivo;
		Pessoa pessoa;		
		try {
			arquivoDeEntrada = new FileReader("C:/Users/Rafael/Desktop/Tec Programacao/Aula_2/dataset/AgeDataset-V2.csv");
			leituraBufferizada = new BufferedReader(arquivoDeEntrada);

			linhaLidaDoArquivo = leituraBufferizada.readLine();
			while (linhaLidaDoArquivo != null) {
				    pessoa = criarObjetoJogo(linhaLidaDoArquivo); 
                    System.out.println(pessoa.getNome() + ','+ pessoa.getDescricao() + ',' + pessoa.getGenero() + ','+ 
                                        pessoa.getPais() + ',' + pessoa.getOcupacao() + ',' + pessoa.getDataNas() + ',' + pessoa.getDataMor());
                
                    vetorPessoa[indice] = pessoa;
                    indice ++;

				    linhaLidaDoArquivo = leituraBufferizada.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		} 
		
		try {
			arquivoDeEntrada.close();
		} 
		catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		} 
		catch (NullPointerException e) {
			System.out.println("Erro: Arquivo não encontrado!");
			e.printStackTrace();
		}


		return vetorPessoa;
    }


     public void EscreverNoArquivo(Pessoa[] vPessoas){
        FileWriter arquivoDeSaida = null;

        String nomePessoa, descricao, genero, pais, ocupacao;
		String anoNascimento, anoMorte;

       
     
		try {
			arquivoDeSaida = new FileWriter("C:/Users/Rafael/Desktop/Tec Programacao/Aula_2/dataset/AgeDataset-V2.txt");
			int totalDePessoas = vPessoas.length;
			
			for (int indiceDePessoa = 0; indiceDePessoa < totalDePessoas; indiceDePessoa++) {
				nomePessoa = vPessoas[indiceDePessoa].getNome();
				descricao = vPessoas[indiceDePessoa].getDescricao();
                genero = vPessoas[indiceDePessoa].getGenero();
                pais = vPessoas[indiceDePessoa].getPais();
                ocupacao = vPessoas[indiceDePessoa].getOcupacao();
                anoNascimento = vPessoas[indiceDePessoa].getDataNas();
                anoMorte = vPessoas[indiceDePessoa].getDataMor();
				arquivoDeSaida.write(nomePessoa + "," + descricao + "," + genero +  "," + pais + "," + 
                                        ocupacao + "," + anoNascimento + "," + anoMorte + "\n");				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		}
		
		try {
			arquivoDeSaida.close();
		} 
		catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		} 
		catch (NullPointerException e) {
			System.out.println("Erro: Arquivo não encontrado!");
			e.printStackTrace();
		}
    }
    
}
