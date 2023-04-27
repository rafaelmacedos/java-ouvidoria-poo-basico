package br.com.ouvidoria.entities;

public class Denuncia extends Ocorrencia{

	public Denuncia(String texto, int id) {
		super(texto, id);
	}
	
	@Override
	public String toString() {
		return "ID: "
				+ this.getId()
				+ " - Denúncia - "
				+ this.getTexto();
	}
}
