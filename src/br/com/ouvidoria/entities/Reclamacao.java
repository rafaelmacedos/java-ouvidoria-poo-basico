package br.com.ouvidoria.entities;

public class Reclamacao extends Ocorrencia{

	public Reclamacao(String texto, int id) {
		super(texto, id);
	}
	
	@Override
	public String toString() {
		return "ID: "
				+ this.getId()
				+ " - Reclamação - "
				+ this.getTexto();
	}
}
