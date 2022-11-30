package br.com.etechorario.pw2.OficinaDeVeiculos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.etechorario.pw2.OficinaDeVeiculos.enums.AutomovelEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Builder
@Table(name = "AUTOMOVEL")
public class Automovel {
	
	@Id
	@Column(name = "crv_auto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int crv;
	
	@Column(name = "placa_auto")
	private String placa;
	
	@Column(name = "modelo_auto")
	private String modelo;
	
	@Column(name = "cor_auto")
	private String cor;
	
	@ManyToOne
	@JoinColumn(name = "id_clie")
	public Cliente id_clie;
	
	@Column(name = "progresso_auto")
	@Enumerated(EnumType.STRING)
	public AutomovelEnum status;
	
}
