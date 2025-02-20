package com.Biblioteca.Gerenciamento_Bibliotecas.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "cliente")
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private String cpf;
	
	private String telefone;
	
	@Column(nullable = false)
	private String endereço;
	
	private Date dataDeCadastro;
	
	@Enumerated(EnumType.STRING)
	private StatusDaConta statusConta;
	
	@Enumerated(EnumType.STRING)
	private TipoDeCliente tipoCliente;

}
