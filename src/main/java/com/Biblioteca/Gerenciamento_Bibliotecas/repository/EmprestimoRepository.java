package com.Biblioteca.Gerenciamento_Bibliotecas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Biblioteca.Gerenciamento_Bibliotecas.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
	
}
