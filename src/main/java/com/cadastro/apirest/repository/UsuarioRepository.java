package com.cadastro.apirest.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.apirest.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	Optional<Usuario> findById(Long id);
}
