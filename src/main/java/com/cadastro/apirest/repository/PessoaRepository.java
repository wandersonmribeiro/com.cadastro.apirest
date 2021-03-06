package com.cadastro.apirest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.apirest.models.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {	
	Optional<Pessoa> findById(Long id);
}
