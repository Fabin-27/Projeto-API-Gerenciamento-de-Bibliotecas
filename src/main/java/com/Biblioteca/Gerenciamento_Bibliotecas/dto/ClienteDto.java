package com.Biblioteca.Gerenciamento_Bibliotecas.dto;

import java.util.Date;

import com.Biblioteca.Gerenciamento_Bibliotecas.model.StatusDaConta;
import com.Biblioteca.Gerenciamento_Bibliotecas.model.TipoDeCliente;

public record ClienteDto(String nome, String email, String cpf, 
		String telefone, String endereco, Date dataDeCadastro,
		StatusDaConta statusConta, TipoDeCliente tipoCliente) {

}
