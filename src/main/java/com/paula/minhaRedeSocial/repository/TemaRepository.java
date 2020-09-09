package com.paula.minhaRedeSocial.repository;

import java.util.List;

import com.paula.minhaRedeSocial.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
