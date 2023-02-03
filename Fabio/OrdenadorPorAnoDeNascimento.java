package exercicio_pessoas_v4_sala_aula_ordenacao;

public class OrdenadorPorAnoDeNascimento implements Ordenador {

	@Override
	public void ordenarPeloMetodoBolha(ColecaoDePessoas listaDePessoas) {
		int i, j;
		int totalDePessoas = listaDePessoas.obterTotalDePessoas();
		
		for (i = 0; i < totalDePessoas; i++) {
			for (j = 0; j < totalDePessoas - i - 1; j++) {
				if (listaDePessoas.obterPessoa(j).obterAnoDeNacimento() > listaDePessoas.obterPessoa(j + 1).obterAnoDeNacimento()) {		
					listaDePessoas.trocarPosicoesEntreDuasPessoas(j,j+1);
				}
			}
		}
	}

	@Override
	public void ordenarPeloMetodoSelecao(ColecaoDePessoas listaDePessoas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarPeloMetodoInsercao(ColecaoDePessoas listaDePessoas) {
		// TODO Auto-generated method stub
		
	}
}
