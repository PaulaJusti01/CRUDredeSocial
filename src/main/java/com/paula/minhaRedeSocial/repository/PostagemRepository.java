package com.paula.minhaRedeSocial.repository;

import java.util.List;

import com.paula.minhaRedeSocial.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByDescricaoContainingIgnoreCase(String descricao);

}
