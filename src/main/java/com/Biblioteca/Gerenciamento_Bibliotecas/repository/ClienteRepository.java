package com.Biblioteca.Gerenciamento_Bibliotecas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Biblioteca.Gerenciamento_Bibliotecas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Optional<Cliente> findClienteByCpf (String cpf);

}