package br.com.ouvidoria.entities;

public class Elogio extends Ocorrencia{

	public Elogio(String texto, int id) {
		super(texto, id);
	}
	
	@Override
	public String toString() {
		return "ID: "
				+ this.getId()
				+ " - Elogio - "
				+ this.getTexto();
	}

}
