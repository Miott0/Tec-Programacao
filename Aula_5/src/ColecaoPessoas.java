package src;

public interface ColecaoPessoas {

    public void AdicionarPessoa(Pessoa pessoa);

    public Pessoa ObterPessoa(int indicePessoa);

    public int ObterTotalDePessoas();

	public boolean ExcluirPessoa();

    public void IncluirPessoa(int indicePessoa, Pessoa pessoa);
	
    public boolean ExcluirPessoaPorPosicao(int indicePessoa);

    public int BuscaPessoa(String n);

    public void organizarPessoaPorInsertionSort();
    
    public void organizarPessoaPorBubbleSort();

    public void organizarPessoaPorSelectionSort();
    
}