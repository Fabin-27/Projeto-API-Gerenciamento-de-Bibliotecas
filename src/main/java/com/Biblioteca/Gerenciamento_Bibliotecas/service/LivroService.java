package com.Biblioteca.Gerenciamento_Bibliotecas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Biblioteca.Gerenciamento_Bibliotecas.model.Livro;
import com.Biblioteca.Gerenciamento_Bibliotecas.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public List<Livro> findAll() {
		return livroRepository.findAll();
	}

	public Livro findById(Long id) throws Exception {
		return livroRepository.findById(id).orElseThrow(() -> new Exception());

	}

	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);

	}

	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);

	}

}
