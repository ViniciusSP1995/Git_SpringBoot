package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Tema; //importa a classe tema
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository <Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase( String descricao);

}
