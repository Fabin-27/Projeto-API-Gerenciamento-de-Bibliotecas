package com.Biblioteca.Gerenciamento_Bibliotecas.dto;

import java.util.Date;

import com.Biblioteca.Gerenciamento_Bibliotecas.model.Cliente;
import com.Biblioteca.Gerenciamento_Bibliotecas.model.Livro;
import com.Biblioteca.Gerenciamento_Bibliotecas.model.StatusDoEmprestimo;

public record EmprestimoDto(Cliente cliente, Livro livro, Date dataEmprestimo, Date dataDevolucao,
		StatusDoEmprestimo statusEmprestimo) {

}
