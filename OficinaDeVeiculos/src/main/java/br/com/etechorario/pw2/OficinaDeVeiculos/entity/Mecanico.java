package br.com.etechorario.pw2.OficinaDeVeiculos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@Table(name = "MECANICO")
public class Mecanico{
	
	@Id
	@Column(name = "id_mec")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome_mec")
	private String nome;
	
	@Column(name = "num_carteira_trabalho_mec")
	private int num_Cart; // numero de carteira de trabalho
	
	@Column(name = "serie_carteira_trabalho_mec")
	private int serie_Cart; // Série de carteira de trabalho
	
	@Column(name = "salario_fixo")
	private long salario_Fixo; // Salario Fixo do mecânico
	
	
	@ManyToMany
	@JoinTable(name = "TBL_REL_CONSERTO_MECANICO", joinColumns = {@JoinColumn(name = "ID_MECANICO")}
	, inverseJoinColumns = {@JoinColumn(name = "ID_CONSERTO")})
	private List<ConsertoAutomovel> consertos;
	
	
}
