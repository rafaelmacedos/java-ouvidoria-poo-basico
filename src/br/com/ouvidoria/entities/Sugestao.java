package br.com.ouvidoria.entities;

public class Sugestao extends Ocorrencia{

	public Sugestao(String texto, int id) {
		super(texto, id);
	}
	
	@Override
	public String toString() {
		return "ID: "
				+ this.getId()
				+ " - Sugestão - "
				+ this.getTexto();
	}
}
