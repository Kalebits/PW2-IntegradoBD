package br.com.etechorario.pw2.OficinaDeVeiculos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Builder
@Table(name = "CLIENTE")
public class Cliente{

	
	@Id
	@Column(name = "id_clie")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome_clie")
	private String nome;
	
	@Column(name = "cpf_clie")
	private int cpf;
	
	@Column(name = "cep_clie")
	private int cep;
	
	@Column(name = "endereco_clie")
	private String endereco;
	
	@Column(name = "cidade_clie")
	private String cidade;
	
	@Column(name = "uf_clie")
	private String uf;
	
	@Column(name = "telefone_clie")
	private int telefone;
	
}

