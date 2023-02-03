package exercicio_pessoas_v4_sala_aula_ordenacao;

public interface Ordenador {
	public void ordenarPeloMetodoBolha(ColecaoDePessoas listaDePessoas);
		
	public void ordenarPeloMetodoSelecao(ColecaoDePessoas listaDePessoas);
	
	public void ordenarPeloMetodoInsercao(ColecaoDePessoas listaDePessoas);

	public void ordenarPeloMetodoQuickSort(ColecaoDePessoas listaDePessoas, int inicio, int fim);
}
