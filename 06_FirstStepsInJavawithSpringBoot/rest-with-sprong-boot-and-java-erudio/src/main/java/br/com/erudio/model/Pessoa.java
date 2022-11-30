package br.com.erudio.model;

import java.io.Serializable;
import java.util.Objects;

public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String primeiroNome;
	private String ultimoNome;
	private String endereco;
	private String genero;
	
	public Pessoa() {}

	public Long getId() {
		return id;
	}
	
	

	public Pessoa(Long id, String primeiroNome, String ultimoNome, String endereco, String genero) {
		this.id = id;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.endereco = endereco;
		this.genero = genero;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
