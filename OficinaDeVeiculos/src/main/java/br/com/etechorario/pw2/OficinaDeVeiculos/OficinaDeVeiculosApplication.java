package br.com.etechorario.pw2.OficinaDeVeiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Repository.ClienteRepository;

import Repository.MaterialRepository;
import Repository.MecanicoRepository;
import br.com.etechorario.pw2.OficinaDeVeiculos.entity.Cliente;

import br.com.etechorario.pw2.OficinaDeVeiculos.entity.Material;
import br.com.etechorario.pw2.OficinaDeVeiculos.entity.Mecanico;

@SpringBootApplication
public class OficinaDeVeiculosApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OficinaDeVeiculosApplication.class, args);
	}

	/*@Autowired
	private ClienteRepository clienteRep;
	
	
	@Override
	public void run(String...  args) throws Exception{
		Cliente c1 = Cliente.builder().nome("458723651452").cpf("1").cep("08032420").endereco("Rua Sabiaúna, 170")
				.cidade("São Paulo").uf("SP").telefone("11981336787").build();
		clienteRep.save(c1);
	}*/
	
	/*@Autowired
	private MaterialRepository materialRep;
	
	
	@Override
	public void run(String...  args) throws Exception{
		Material mat = Material.builder().desc_Mat("Motor").quant_Mat("5").preco_Mat("3000").build();
		materialRep.save(mat);
	}*/
	
	private MecanicoRepository mecanicoRep;
	
	
	@Override
	public void run(String...  args) throws Exception{
		Mecanico mec = Mecanico.builder().nome("José Augusto da Silva").num_Cart("1452896")
				.serie_Cart("145-3").salario_Fixo("1500").build();
		mecanicoRep.save(mec);
	}
	
	
}
