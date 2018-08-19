package com.cadastro.apirest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.apirest.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {	
	Optional<Pessoa> findById(Long id);
}
