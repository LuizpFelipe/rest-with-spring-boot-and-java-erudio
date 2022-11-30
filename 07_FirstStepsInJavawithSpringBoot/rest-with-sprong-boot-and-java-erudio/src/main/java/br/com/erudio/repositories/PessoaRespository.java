package br.com.erudio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.erudio.model.Pessoa;

@Repository
public interface PessoaRespository extends JpaRepository<Pessoa, Long> {}
