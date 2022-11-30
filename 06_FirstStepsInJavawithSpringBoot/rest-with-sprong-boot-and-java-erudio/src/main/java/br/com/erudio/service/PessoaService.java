package br.com.erudio.service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Pessoa;


@Service
public class PessoaService {
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PessoaService.class.getName());
	
	
	public Pessoa findById(String nome) {
		
		logger.info("Procura Pessoa...");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(counter.incrementAndGet());
		pessoa.setPrimeiroNome("Luiz");
		pessoa.setUltimoNome("Pintor");
		pessoa.setEndereco("São Paulo");
		pessoa.setGenero("Masculino");
		
		return pessoa;
	}
}
