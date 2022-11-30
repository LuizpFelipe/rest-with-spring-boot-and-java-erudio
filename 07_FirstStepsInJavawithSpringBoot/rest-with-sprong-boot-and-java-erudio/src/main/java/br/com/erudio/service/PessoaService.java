package br.com.erudio.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erudio.exception.ResourceNotFoundException;
import br.com.erudio.model.Pessoa;
import br.com.erudio.repositories.PessoaRespository;

@Service
public class PessoaService {
	private Logger logger = Logger.getLogger(PessoaService.class.getName());

	@Autowired
	PessoaRespository repository;

	public List<Pessoa> findAll() {
		logger.info("Mostrando todas as pessoas...");
		return repository.findAll();
	}


	public Pessoa findById(Long id) {
		logger.info("Procura Pessoa...");
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Nenhuma Pessoa encontrada neste ID..."));
	}

	public Pessoa create(Pessoa pessoa) {
		logger.info("Criando PEssoa");
		return repository.save(pessoa);
	}

	public Pessoa update(Pessoa pessoa) {
		logger.info("Atualizando Pessoa");
		
		Pessoa entity = repository.findById(pessoa.getId())
			.orElseThrow(()-> new ResourceNotFoundException("Nenhuma Pessoa encontrada neste ID..."));

		entity.setPrimeiroNome(pessoa.getPrimeiroNome());
		entity.setUltimoNome(pessoa.getUltimoNome());
		entity.setEndereco(pessoa.getEndereco());
		entity.setGenero(pessoa.getGenero());
		return repository.save(entity);
	}

	public void delete(Long id) {
		logger.info("Deletando Pessoa");
		Pessoa entity = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Nenhuma Pessoa encontrada neste ID..."));
		repository.delete(entity);
	}
}
