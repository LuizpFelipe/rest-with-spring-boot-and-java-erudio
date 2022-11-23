package br.com.erudio;

public class Saudacao {
	private Long id;
	private String contente;

	public Saudacao(Long id, String contente) {
		super();
		this.id = id;
		this.contente = contente;
	}

	public Long getId() {
		return id;
	}

	public String getContente() {
		return contente;
	}

}
