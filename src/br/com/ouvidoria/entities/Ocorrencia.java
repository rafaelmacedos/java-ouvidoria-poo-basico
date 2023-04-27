package br.com.ouvidoria.entities;


public abstract class Ocorrencia {
	private String texto;
	private int id;
		
	public Ocorrencia(String texto, int id) {
		this.texto = texto;
		this.id = id;
	}

	public String getTexto() {
		return this.texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public int getId() {
		return this.id;
	}


	public void setId(int id) {
		this.id = id;
	}

		
	@Override public String toString() {
		return 
			this.id
			+ this.texto;

		
	}

	
	}


