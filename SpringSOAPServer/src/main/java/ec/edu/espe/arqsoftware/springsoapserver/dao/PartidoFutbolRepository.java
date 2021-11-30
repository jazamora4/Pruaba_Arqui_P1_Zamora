package ec.edu.espe.arqsoftware.springsoapserver.dao;

import ec.edu.espe.arqsoftware.springsoapserver.model.PartidoFutbol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PartidoFutbolRepository extends JpaRepository<PartidoFutbol,String> {

    List<PartidoFutbol> findAllByFechaAfter(Date fecha);
}
