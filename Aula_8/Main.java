import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner sc = new Scanner(System.in);
		int opcao;
		do 
		{
			String nome = "";

			System.out.println("\n\n*************** Menu de Opções ****************");
			System.out.println("1 - Adicionar Elemento Inicio");
			System.out.println("2 - Adicionar Elemento Fim");
			System.out.println("3 - Exluir Elemento Inicio");
			System.out.println("4 - Exluir Elemento Fim");
			System.out.println("5 - Buscar Elemento");
            System.out.println("6 - Listar Elementos");
			System.out.println("0 - Sair do programa");
			opcao = sc.nextInt();	

			switch (opcao) {
			case 1: 
					clearBuffer(sc);
					System.out.println("Digite um Nome:");
					
					nome = sc.nextLine();
					lista.adiciona(nome);
					break;
			case 2:
					clearBuffer(sc);
					System.out.println("Digite um Nome:");
					nome = sc.nextLine();
					lista.adicionaFinalLista(nome);
					break;
			case 3: 
					exluirInicio(lista);
					break;
			case 4: 
					exluirFim(lista);
					break;

			case 5:
					clearBuffer(sc);
					System.out.println("Digite um Nome:");
					nome = sc.nextLine();
					
					System.out.println(buscarElemento(lista, nome));
					break;

			case 6: 
					listar(lista);
					break;
			}
		}
		while (opcao != 0);
	}


    
    private static void listar(ListaEncadeada lista) {
        No aux = lista.obterNo();
		System.out.print("[");
        while (aux!=null){
            System.out.print(" " +aux.getElemento() +" ");
            aux = aux.getProximo();
        }
		System.out.println("]");
    }

	private static void exluirInicio(ListaEncadeada lista){ 
        boolean i = lista.exlcuirInicio();
        if(i){
            System.out.println("excluido com sucesso");
        }else{
            System.out.println("Falha na Exclusao");
        }
    }

    private static void exluirFim(ListaEncadeada lista){ 
        boolean i = lista.exlcuirFim();
        if(i){
            System.out.println("excluido com sucesso");
        }else{
            System.out.println("Falha na Exclusao");
        }
    }


	private static String buscarElemento(ListaEncadeada lista,String busca){
		No aux = lista.obterNo();
        while (aux!=null){
			String nome = aux.getElemento();
			if (busca.equals(nome)) {
				
				return "Elemento encontrado: " + nome;
			}
			aux = aux.getProximo();
        }
		return "Elemento nao econtrado";
	}


	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
