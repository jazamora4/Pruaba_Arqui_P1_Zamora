package ec.edu.espe.arqsoftware.springsoapclient.controller;

import ec.edu.espe.arqsoftware.springsoapclient.service.LocalidadPartidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/localidad")
public class LocalidadPartidoController {
    private final LocalidadPartidoService service;

    public LocalidadPartidoController(LocalidadPartidoService service) {
        this.service = service;
    }

    @GetMapping(value = "codigoPartido")
    public ResponseEntity obtenerLocalidades(@PathVariable("codigoPartido") String codigoPartido){
        return ResponseEntity.ok(this.service.obtenerLocalidades(codigoPartido).getLocalidadRS());
    }
}
