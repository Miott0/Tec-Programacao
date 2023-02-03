package exercicio_pessoas_v4_sala_aula_ordenacao;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExercicioDatasetPessoas {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		DatasetPessoas datasetpessoas = new DatasetPessoas();
		String caminhoDoArquivo = "C:/Users/Rafael/Desktop/Tec Programacao/Aula_5/dataset/AgeDataset-V2.csv";
		ColecaoDePessoas listaDePessoas = datasetpessoas.lerDoArquivo(caminhoDoArquivo, new VetorDePessoas());
		System.out.printf("\nConteúdo do arquivo texto:\n");
		int numeroDoRegistro = 1;
		Pessoa pessoa = null;
		int totalDePessoas = listaDePessoas.obterTotalDePessoas();
		for (int numeroDaPessoa = 0; numeroDaPessoa < totalDePessoas; numeroDaPessoa++) {
			pessoa = listaDePessoas.obterPessoa(numeroDaPessoa);
			System.out.println("***Registro número: " + numeroDoRegistro + "***");
			System.out.println("Nome: " + pessoa.obterNome());
			System.out.println("Descrição: " + pessoa.obterDescricao());
			System.out.println("Gênero: " + pessoa.obterGenero());
			System.out.println("País: " + pessoa.obterPais());
			System.out.println("Ocupação:" + pessoa.obterOcupacao());
			System.out.println("Ano de nascimento:" + pessoa.obterAnoDeNacimento());
			System.out.println("Ano de falecimento:" + pessoa.obterAnoDeFalecimento() + "\n\n");
			numeroDoRegistro++;
		}
		
		listaDePessoas.ordenarLista(new OrdenadorPorAnoDeNascimento());
		System.out.println("*********************************************************************************");
		System.out.println("******************* Registros Ordenados pelo ano de nascimento ******************");
		System.out.println("*********************************************************************************\n");
		totalDePessoas = listaDePessoas.obterTotalDePessoas();
		numeroDoRegistro = 1;
		for (int numeroDaPessoa = 0; numeroDaPessoa < totalDePessoas; numeroDaPessoa++) {
			pessoa = listaDePessoas.obterPessoa(numeroDaPessoa);
			System.out.println("***Registro número: " + numeroDoRegistro + "***");
			System.out.println("Nome: " + pessoa.obterNome());
			System.out.println("Descrição: " + pessoa.obterDescricao());
			System.out.println("Gênero: " + pessoa.obterGenero());
			System.out.println("País: " + pessoa.obterPais());
			System.out.println("Ocupação:" + pessoa.obterOcupacao());
			System.out.println("Ano de nascimento:" + pessoa.obterAnoDeNacimento());
			System.out.println("Ano de falecimento:" + pessoa.obterAnoDeFalecimento() + "\n\n");
			numeroDoRegistro++;
		}
		
		System.out.println();
		datasetpessoas.escreverNoArquivo(caminhoDoArquivo + "alterado3", listaDePessoas);
	}
}
