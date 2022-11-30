package br.com.etechorario.pw2.OficinaDeVeiculos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Builder
@Table(name = "CONSERTO_AUTOMOVEL")
public class ConsertoAutomovel {
	
	@Id
	@Column(name = "ID_CONSERTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "crv_auto")
	private Automovel crv;
	
	@OneToMany
	@JoinColumn(name = "id_mat")
	private Material id_Mat;
	
}
