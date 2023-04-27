package br.com.ouvidoria.repository;

import java.util.ArrayList;

import br.com.ouvidoria.entities.Denuncia;
import br.com.ouvidoria.entities.Elogio;
import br.com.ouvidoria.entities.Ocorrencia;
import br.com.ouvidoria.entities.Reclamacao;
import br.com.ouvidoria.entities.Sugestao;

public class OuvidoriaRepository {
	private ArrayList<Ocorrencia> listaOcorrencias;

	public OuvidoriaRepository() {
		this.listaOcorrencias = new ArrayList<Ocorrencia>();
	}

	public void salvarOcorrencia(int opcao, String texto, int id) {
		if (opcao == 1) {
			Elogio novoElogio = new Elogio(texto, id);
			listaOcorrencias.add(novoElogio);
		}

		else if (opcao == 2) {
			Sugestao novaSugestao = new Sugestao(texto, id);
			listaOcorrencias.add(novaSugestao);
		}

		else if (opcao == 3) {
			Reclamacao novaReclamacao = new Reclamacao(texto, id);
			listaOcorrencias.add(novaReclamacao);
		}

		else if (opcao == 4) {
			Denuncia novaDenuncia = new Denuncia(texto, id);
			listaOcorrencias.add(novaDenuncia);
		}
	}

	public boolean listaVazia() {
		return listaOcorrencias.isEmpty();
	}

	public boolean listarTodasOcorrencias() {
		boolean estaVazia = listaVazia();

		if (estaVazia) {
			return false;
		}

		else {
			System.out.println("Tela de Listagem");
			System.out.println("\nA quantidade de ocorrências registradas é: " + listaOcorrencias.size());
			for (Ocorrencia listagem : listaOcorrencias) {
				System.out.println(listagem.toString());
			}
		}
		return true;
	}

	public boolean listarOcorrenciaPeloTipo(int opcaoTipo) {
		boolean estaVazia = listaVazia();

		if (estaVazia) {
			return false;
		}

		else {
			System.out.println("Tela de Listagem");
			if (opcaoTipo == 2) {
				for (Ocorrencia ocorrencia : listaOcorrencias) {
					if (ocorrencia.getClass().equals(Elogio.class)) {
						System.out.println(ocorrencia.toString());
					}

				}

			}

			else if (opcaoTipo == 3) {
				for (Ocorrencia ocorrencia : listaOcorrencias) {
					if (ocorrencia.getClass().equals(Sugestao.class)) {
						System.out.println(ocorrencia.toString());
					}
				}
			}

			else if (opcaoTipo == 4) {
				for (Ocorrencia ocorrencia : listaOcorrencias) {
					if (ocorrencia.getClass().equals(Reclamacao.class)) {
						System.out.println(ocorrencia.toString());
					}
				}

			}

			else if (opcaoTipo == 5) {
				for (Ocorrencia ocorrencia : listaOcorrencias) {
					if (ocorrencia.getClass().equals(Denuncia.class)) {
						System.out.println(ocorrencia.toString());
					}
				}
			}
			return true;
		}
	}

	public boolean listarOcorrenciaPeloID(int id) {
		boolean estaVazia = listaVazia();

		if (estaVazia) {
			return false;
		}

		else {
			for (Ocorrencia ocorrencia : listaOcorrencias) {
				if (ocorrencia.getId() == id) {
					System.out.println(ocorrencia.toString());
					break;
				}
			}
			return true;
		}
	}
	
	public boolean apagarOcorrenciaPeloID(int idApagar) {
		for (Ocorrencia listagem : listaOcorrencias) {
			if (listagem.getId() == idApagar) {
				listaOcorrencias.remove(listagem);
				return true;
			}
		}
		return false;
	}

	public void apagarLista() {
		listaOcorrencias.clear();
	}

}
