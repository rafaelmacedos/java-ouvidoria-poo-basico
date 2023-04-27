package br.com.ouvidoria;

import java.util.Scanner;

import br.com.ouvidoria.repository.OuvidoriaRepository;

public class Service {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OuvidoriaRepository rp = new OuvidoriaRepository();
		Menu.mostrarLinha();
		Menu.mostrarEspaco();
		System.out.println("Bem vindo ao Sistema de Ouvidoria do Macedo");
		Menu.mostrarEspaco();

		boolean menu = true;
		int contador = 0;

		while (menu == true) {
			try {
				Menu.mostrarMenu();
				System.out.print("\nDigite sua opção: ");
				int opcao = Integer.parseInt(sc.nextLine());

				if (opcao == 1) {
					Menu.mostrarMenuSalvar();
					System.out.print("\nDigite sua opção: ");
					Menu.mostrarEspaco();
					int opcaoCategoria = Integer.parseInt(sc.nextLine());

					if (opcaoCategoria == 1) {
						System.out.println("\nDigite sua Mensagem: ");
						String texto = sc.nextLine();
						contador += 1;
						rp.salvarOcorrencia(opcaoCategoria, texto, contador);
					}

					else if (opcaoCategoria == 2) {
						System.out.println("\nDigite sua Mensagem: ");
						String texto = sc.nextLine();
						contador += 1;
						rp.salvarOcorrencia(opcaoCategoria, texto, contador);
					}

					else if (opcaoCategoria == 3) {
						System.out.println("\nDigite sua Mensagem: ");
						String texto = sc.nextLine();
						contador += 1;
						rp.salvarOcorrencia(opcaoCategoria, texto, contador);
					}

					else if (opcaoCategoria == 4) {
						System.out.println("\nDigite sua Mensagem: ");
						String texto = sc.nextLine();
						contador += 1;
						rp.salvarOcorrencia(opcaoCategoria, texto, contador);
					}

					else if (opcaoCategoria == 5) {
					}

					else {
						System.out.println("\nOpção inválida, tente novamente.\n");
					}

				}

				else if (opcao == 2) {
					Menu.mostrarMenuListar();
					int opcaoListar = Integer.parseInt(sc.nextLine());

					if (opcaoListar == 1) {
						if (rp.listarTodasOcorrencias() == false) {
							System.out.println("\nNão existem ocorrências registradas no sistema.");
						}
					}

					else if (opcaoListar == 2) {
						if (rp.listarOcorrenciaPeloTipo(opcaoListar) == false) {
							System.out.println("\nNão existem ocorrências registradas no sistema.");
						}
					}

					else if (opcaoListar == 3) {
						if (rp.listarOcorrenciaPeloTipo(opcaoListar) == false) {
							System.out.println("\nNão existem ocorrências registradas no sistema.");
						}
					}

					else if (opcaoListar == 4) {
						if (rp.listarOcorrenciaPeloTipo(opcaoListar) == false) {
							System.out.println("\nNão existem ocorrências registradas no sistema.");
						}
					}

					else if (opcaoListar == 5) {
						if (rp.listarOcorrenciaPeloTipo(opcaoListar) == false) {
							System.out.println("\nNão existem ocorrências registradas no sistema.");
						}
					}

					else if (opcaoListar == 6) {
						if (rp.listaVazia()) {
							System.out.println("\nNão existem ocorrências registradas no sistema.");
						}
						else {
							System.out.println("\nDigite o ID da ocorrência que você deseja listar");
							int id = Integer.parseInt(sc.nextLine());

							if (rp.listarOcorrenciaPeloID(id) == false) {
								System.out.println("\nNão existem ocorrências registradas no sistema.");
							}
						}
					}

					else if (opcaoListar == 7) {
					}

					else {
						Menu.mostrarEspaco();
						System.out.println("Opção inválida, tente novamente.");
						Menu.mostrarEspaco();
					}
					Menu.mostrarEspaco();
				}

				else if (opcao == 3) {
					if (rp.listarTodasOcorrencias() == true) {
						System.out.println("\nDigite o ID da ocorrência que você deseja apagar: ");
						int idApagar = Integer.parseInt(sc.nextLine());
						rp.apagarOcorrenciaPeloID(idApagar);
					}
					else {
						System.out.println("\nNão existem ocorrências registradas no sistema.");

					}

				}

				else if (opcao == 4) {

					if (rp.listarTodasOcorrencias() == false) {
						System.out.println("\nNão existem ocorrências registradas no sistema.");
					}

					else {
						rp.apagarLista();
						System.out.println("\nTodas as ocorrências foram apagadas com sucesso.");
					}

					Menu.mostrarEspaco();

				}

				else if (opcao == 5) {
					Menu.mostrarEspaco();
//					System.out.println("Obrigado por usar o Sistema de Ouvidoria :)");
					System.out.println("* VOCÊ ESTÁ SAINDO DA OUVIDORIA DO MACEDO... *");
					System.out.println(" █▀▄▀█ █░▒█ ▀█▀ ▀▀█▀▀ █▀▀▀█   █▀▀▀█ █▀▀█ █▀▀█ ▀█▀ █▀▀█ █▀▀█ █▀▀▄ █▀▀▀█ █\r\n"
							+ " █▒█▒█ █░▒█ ░█░ ░▒█░░ █░░▒█   █░░▒█ █▀▀▄ █▄▄▀ ░█░ █░▄▄ █▄▄█ █░▒█ █░░▒█ ▀\r\n"
							+ " █░░▒█ ▀▄▄▀ ▄█▄ ░▒█░░ █▄▄▄█   █▄▄▄█ █▄▄█ █░▒█ ▄█▄ █▄▄█ █░▒█ █▄▄▀ █▄▄▄█ ▄");
					menu = false;
				}

				else {
					Menu.mostrarEspaco();
					System.out.println("Opção inválida, tente novamente.");
					Menu.mostrarEspaco();
				}

			} catch (NumberFormatException e) {
				Menu.mostrarEspaco();
				System.out.println("Opção inválida, tente novamente.");
				Menu.mostrarEspaco();
			}
		}

		sc.close();
	}

}
