package test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import src.Pessoa;
import src.TratamentoDados;
import src.VetorDePessoas;



public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //String caminhoDoArquivo = "C:/Users/Rafael/Desktop/Tec Programacao/Aula_3/dataset/AgeDataset-V2.csv";


		Scanner entradaDoTeclado = new Scanner(System.in);	
		VetorDePessoas listaDePessoas = new VetorDePessoas();
		TratamentoDados date = new TratamentoDados();
		date.lerDoArquivo(listaDePessoas);
		
		int opcao;
		do 
		{
			System.out.println("\n\n*************** Menu de Opções ****************");
			System.out.println("1 - Adicionar Pessoa");
			System.out.println("2 - Obter Pessoa");
			System.out.println("3 - Listar Pessoas");
			System.out.println("0 - Sair do programa");
			opcao = entradaDoTeclado.nextInt();			
			switch (opcao) {
			case 1: adicionarPessoa(listaDePessoas);
					break;
			case 2:
					obterPessoa(listaDePessoas);
					break;
			case 3: listarPessoas(listaDePessoas);
					break;
			}
			date.escreverNoArquivo(listaDePessoas);
		}
		while (opcao != 0);
	}

	private static void adicionarPessoa(VetorDePessoas pessoas){
		Scanner entradaDoTeclado = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = entradaDoTeclado.nextLine();
		System.out.println("Descricao: ");
		String descricao = entradaDoTeclado.nextLine();
		System.out.println("Genero: ");
		String genero = entradaDoTeclado.nextLine();
		System.out.println("Pais: ");
		String pais = entradaDoTeclado.nextLine();
		System.out.println("Ocupacao: ");
		String ocupacao = entradaDoTeclado.nextLine();
		System.out.println("Data Nascimento: ");
		String dataNas = entradaDoTeclado.nextLine();
		System.out.println("Data Morte: ");
		String dataMor = entradaDoTeclado.nextLine();
		
		Pessoa p = new Pessoa(nome, descricao, genero, pais, ocupacao, dataNas, dataMor);

		pessoas.AdicionaPessoa(p);
	}

	private static void obterPessoa(VetorDePessoas pessoas){
		Scanner entradaDoTeclado = new Scanner(System.in);
		System.out.println("Digite a posicao: ");
		int pos = entradaDoTeclado.nextInt();
		Pessoa p = pessoas.ObterPessoa(pos);

		System.out.println("\n------------------------------------------");
		System.out.println("Nome:" + p.getNome());
		System.out.println("Descricao:" + p.getDescricao());
		System.out.println("Genero:" + p.getGenero());
		System.out.println("Pais:" + p.getPais());
		System.out.println("Ocupacao:" + p.getOcupacao());
		System.out.println("Data de Nascimento:" + p.getDataNas());
		System.out.println("Data de Morte:" + p.getDataMor());
		System.out.println("\n------------------------------------------");
	}

	private static void listarPessoas(VetorDePessoas pessoas){
		int totalDeJogos = pessoas.TotaldePessoa();
		for(int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) {
			Pessoa p = pessoas.ObterPessoa(indiceDoJogo);
			System.out.println("\n------------------------------------------");
			System.out.println("Nome:" + p.getNome());
			System.out.println("Descricao:" + p.getDescricao());
			System.out.println("Genero:" + p.getGenero());
			System.out.println("Pais:" + p.getPais());
			System.out.println("Ocupacao:" + p.getOcupacao());
			System.out.println("Data de Nascimento:" + p.getDataNas());
			System.out.println("Data de Morte:" + p.getDataMor());
			System.out.println("\n------------------------------------------");
		}
	}

    
}
