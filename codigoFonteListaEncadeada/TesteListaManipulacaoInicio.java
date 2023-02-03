
public class TesteListaManipulacaoInicio {

	public static void main(String[] args) {
		ListaEncadeadaSimples listaEncadeada = new ListaEncadeadaSimples();
		
		System.out.println("\n------------ Após a inclusão ------------");
		listaEncadeada.adicionarInicio(10);
		listaEncadeada.adicionarInicio(20);
		listaEncadeada.adicionarInicio(30);
		listaEncadeada.adicionarInicio(40);
		listaEncadeada.adicionarInicio(50);
		listaEncadeada.adicionarInicio(60);
		listaEncadeada.adicionarInicio(80);
		System.out.println(listaEncadeada); //O mesmo que: System.out.println(listaEncadeada.toString());	
		
		System.out.println("\n\n------------ Após uma exclusão ------------");	
		System.out.println(listaEncadeada.excluirInicio());
		System.out.println(listaEncadeada);
		
		System.out.println("\n------------ Após mais duas exclusões ------------");	
		System.out.println(listaEncadeada.excluirInicio());
		System.out.println(listaEncadeada.excluirInicio());
		System.out.println(listaEncadeada);
		
		System.out.println("\n------------ Após mais quatro exclusões ------------");	
		System.out.println(listaEncadeada.excluirInicio());https://ead2.iff.edu.br/course/editsection.php?id=189981&sr&delete=1&sesskey=XuT7mldS5p
		System.out.println(listaEncadeada.excluirInicio());
		System.out.println(listaEncadeada.excluirInicio());
		System.out.println(listaEncadeada.excluirInicio());
		System.out.println(listaEncadeada);
		
		System.out.println("\n------------ Após mais uma exclusão ------------");	
		System.out.println(listaEncadeada.excluirInicio());
		System.out.println(listaEncadeada);
		
		System.out.println("\n------------ Nova inclusão ------------");
		listaEncadeada.adicionarInicio(10);
		listaEncadeada.adicionarInicio(20);
		listaEncadeada.adicionarInicio(30);
		listaEncadeada.adicionarInicio(40);
		listaEncadeada.adicionarInicio(50);
		listaEncadeada.adicionarInicio(60);
		listaEncadeada.adicionarInicio(80);
		System.out.println(listaEncadeada); 
				
		System.out.println("\n------------ Listagem com iterador ------------");	
		Iterador iteradorListaEncadeada = listaEncadeada.obterIterador();
		while (iteradorListaEncadeada.temProximo()) {
			System.out.println(iteradorListaEncadeada.obterElemento());
		}
	}
}
