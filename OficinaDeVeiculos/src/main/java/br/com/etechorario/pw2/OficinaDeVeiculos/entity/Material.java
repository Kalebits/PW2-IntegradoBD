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
@Table(name = "MATERIAL")
public class Material {
    
    @Id
    @Column(name = "id_mat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Mat;
    
    @Column(name = "descricao_mat")
    private String desc_Mat;
    
    @Column(name = "quant_mat")
    private int quant_Mat;
    
    @Column(name = "preco_unit_mat")
    private long preco_Mat;
    
    
    
}