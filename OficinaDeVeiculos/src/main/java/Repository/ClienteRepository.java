package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechorario.pw2.OficinaDeVeiculos.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
