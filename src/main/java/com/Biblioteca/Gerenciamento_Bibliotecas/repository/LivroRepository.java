package com.Biblioteca.Gerenciamento_Bibliotecas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Biblioteca.Gerenciamento_Bibliotecas.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	Optional<Livro> findLivroByISBN (String iSBN);

}