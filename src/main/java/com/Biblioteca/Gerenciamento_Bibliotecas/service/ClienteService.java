package com.Biblioteca.Gerenciamento_Bibliotecas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Biblioteca.Gerenciamento_Bibliotecas.model.Cliente;
import com.Biblioteca.Gerenciamento_Bibliotecas.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
		
	}
	
	public Cliente findById (Long id) throws Exception{
		return clienteRepository.findById(id).orElseThrow(() -> new Exception()); 
		
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
		
	}
	

}
