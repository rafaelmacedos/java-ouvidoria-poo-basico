package br.com.ouvidoria;

public class Menu {

	private Menu() {
	}

	public static void mostrarLinha() {
		String barra = "-";
		String barraVezes = barra.repeat(50);
		System.out.println(barraVezes);
	}

	public static void mostrarEspaco() {
		System.out.println("");
	}

	public static void mostrarMenu() {
		mostrarLinha();
		System.out.println("Menu de opções: ");
		mostrarEspaco();
		System.out.println("1 - Cadastrar Ocorrência");
		System.out.println("2 - Listar Ocorrências");
		System.out.println("3 - Apagar uma ocorrência");
		System.out.println("4 - Apagar todas as ocorrências");
		System.out.println("5 - Sair do sistema");
	}

	public static void mostrarMenuSalvar() {
		mostrarLinha();
		System.out.println("\nCadastrando uma ocorrência:");
		mostrarEspaco();
		System.out.println("Categorias:");
		System.out.println("1 - Elogio");
		System.out.println("2 - Sugestão");
		System.out.println("3 - Reclamação");
		System.out.println("4 - Denúncia");
		System.out.println("\n5 - Voltar");
	}
	
	public static void mostrarMenuListar() {
		mostrarLinha();
		System.out.println("Menu de opções: ");
		mostrarEspaco();
		System.out.println("1 - Listar todas as Ocorrências");
		System.out.println("2 - Listar apenas Elogios");
		System.out.println("3 - Listar apenas Sugestões");
		System.out.println("4 - Listar apenas Reclamações");
		System.out.println("5 - Listar apenas Denúncias");
		System.out.println("6 - Listar ocorrência pelo ID");
		System.out.println("\n7 - Voltar");
	}
}
