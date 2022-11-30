package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechorario.pw2.OficinaDeVeiculos.entity.Material;

public interface MaterialRepository extends JpaRepository<Material, Integer>{

}
