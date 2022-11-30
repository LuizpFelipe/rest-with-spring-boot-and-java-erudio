package br.com.erudio.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Date horaDoErro;
	private String msg;
	private String detalhe;
	
	
	public ExceptionResponse(Date horaDoErro, String msg, String detalhe) {
		this.horaDoErro = horaDoErro;
		this.msg = msg;
		this.detalhe = detalhe;
	}

	public Date getHoraDoErro() {
		return horaDoErro;
	}


	public String getMsg() {
		return msg;
	}


	public String getDetalhe() {
		return detalhe;
	}
	
	
	
}
