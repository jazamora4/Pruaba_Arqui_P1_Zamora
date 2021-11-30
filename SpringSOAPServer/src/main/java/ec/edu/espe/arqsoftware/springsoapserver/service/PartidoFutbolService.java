package ec.edu.espe.arqsoftware.springsoapserver.service;

import ec.edu.espe.arqsoftware.springsoapserver.dao.PartidoFutbolRepository;
import ec.edu.espe.arqsoftware.springsoapserver.model.PartidoFutbol;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class PartidoFutbolService {
    private final PartidoFutbolRepository repository;

    public PartidoFutbolService(PartidoFutbolRepository repository) {
        this.repository = repository;
    }

    public List<PartidoFutbol> obtainPartidoAfterActualDate(){
        LocalDateTime now = LocalDateTime.now();

        return this.repository.findAllByFechaAfter(java.sql.Timestamp.valueOf(now));
    }
}
