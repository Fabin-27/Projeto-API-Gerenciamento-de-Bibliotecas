package com.Biblioteca.Gerenciamento_Bibliotecas.dto;

import com.Biblioteca.Gerenciamento_Bibliotecas.model.StatusDoLivro;
import com.Biblioteca.Gerenciamento_Bibliotecas.model.TipoDeLivro;

public record LivroDto(String titulo, String autor, String editora, Integer anoDePublicação, 
		String isbn, TipoDeLivro categoria, StatusDoLivro statusLivro) {

}
