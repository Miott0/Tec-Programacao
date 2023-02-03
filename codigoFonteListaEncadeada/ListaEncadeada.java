
public interface ListaEncadeada {
	
	public void adicionarInicio(int dado);
	
	public void adicionarFim(int dado);
	
	public boolean adicionarMeio(int posicaoInclusao, int dado);
	
	public boolean excluirInicio();
	
	public boolean excluirFim();
	
	public boolean excluirMeio(int posicao);
	
	@Override
	public String toString();
}

