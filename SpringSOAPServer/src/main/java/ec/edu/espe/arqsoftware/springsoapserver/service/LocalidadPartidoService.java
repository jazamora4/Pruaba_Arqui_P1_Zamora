package ec.edu.espe.arqsoftware.springsoapserver.service;

import ec.edu.espe.arqsoftware.springsoapserver.dao.LocalidadPartidoRepository;
import ec.edu.espe.arqsoftware.springsoapserver.dao.PartidoFutbolRepository;
import ec.edu.espe.arqsoftware.springsoapserver.model.LocalidadPartido;
import ec.edu.espe.arqsoftware.springsoapserver.model.PartidoFutbol;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class LocalidadPartidoService {
    private final LocalidadPartidoRepository repository;
    private final PartidoFutbolRepository partidoFutbolRepository;

    public LocalidadPartidoService(LocalidadPartidoRepository repository, PartidoFutbolRepository partidoFutbolRepository) {
        this.repository = repository;
        this.partidoFutbolRepository = partidoFutbolRepository;
    }

    public List<LocalidadPartido> obtainByCodigoPartidoAndGreaterThaZero(String codigoPartido){
        return this.repository.findByCodigoPartidoAndDisponibilidadGreaterThanEqual(codigoPartido,0);
    }

}
