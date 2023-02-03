package exercicio_pessoas_v4_sala_aula_ordenacao;

public interface ColecaoDePessoas {
	
	public void adicionarPessoa(Pessoa pessoa);
	
	public boolean excluirPessoa();
	
	public Pessoa obterPessoa(int posicaoDaPessoa);
	
	public int obterTotalDePessoas();
	
	void ordenarLista(Ordenador ordenador);

	public void trocarPosicoesEntreDuasPessoas(int i, int j);
	
	public void alterarPessoa(int posicaoDaPessoa, Pessoa novaPessoa);
}
