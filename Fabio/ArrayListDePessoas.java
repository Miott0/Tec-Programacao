package exercicio_pessoas_v4_sala_aula_ordenacao;

import java.util.ArrayList;

public class ArrayListDePessoas implements ColecaoDePessoas{
	private ArrayList <Pessoa> listaDePessoas= null;
	private int totalDePessoas;

	public ArrayListDePessoas() {
		listaDePessoas = new ArrayList<Pessoa>();
		new ArrayList<Pessoa>();
		this.totalDePessoas = 0;
	}
	
	@Override
	public void adicionarPessoa(Pessoa pessoa) {
		this.listaDePessoas.add(pessoa);
		this.totalDePessoas++;
	}
	
	@Override
	public boolean excluirPessoa() {
		if (this.totalDePessoas > 0) {
			this.listaDePessoas.remove(totalDePessoas);
			this.totalDePessoas--;
			return true;
		}
		return false;
	}
	
	@Override
	public Pessoa obterPessoa(int indiceDaPessoa) {
		return this.listaDePessoas.get(indiceDaPessoa);
	}
	
	@Override
	public int obterTotalDePessoas() {
		return this.totalDePessoas;
	}

	@Override
	public void ordenarLista(Ordenador ordenador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trocarPosicoesEntreDuasPessoas(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarPessoa(int posicaoDaPessoa, Pessoa novaPessoa) {
		// TODO Auto-generated method stub
		
	}
}
