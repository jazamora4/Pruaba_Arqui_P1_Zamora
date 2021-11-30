package ec.edu.espe.arqsoftware.springsoapserver.dao;

import ec.edu.espe.arqsoftware.springsoapserver.model.LocalidadPartido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocalidadPartidoRepository extends JpaRepository<LocalidadPartido, String> {

    List<LocalidadPartido> findByCodigoPartidoAndDisponibilidadGreaterThanEqual(String codigoPartido, Integer disponibilidad);
}
