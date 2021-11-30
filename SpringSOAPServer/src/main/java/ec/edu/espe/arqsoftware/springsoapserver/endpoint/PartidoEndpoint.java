package ec.edu.espe.arqsoftware.springsoapserver.endpoint;

import ec.edu.espe.arqsoftware.springsoapserver.model.LocalidadPartido;
import ec.edu.espe.arqsoftware.springsoapserver.model.PartidoFutbol;
import ec.edu.espe.arqsoftware.springsoapserver.service.LocalidadPartidoService;
import ec.edu.espe.arqsoftware.springsoapserver.service.PartidoFutbolService;
import ec.edu.espe.arqsoftware.springsoapserver.transform.LocalidadRSTransform;
import ec.edu.espe.arqsoftware.springsoapserver.transform.PartidoRSTransform;
import ec.edu.espe.arqsoftware.springsoapserver.ws.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
@Slf4j
public class PartidoEndpoint {
    private static final String NAMESPACE_URI = "http://espe.edu.ec/arqsoftware/SpringSOAPServer/ws";

    private final PartidoFutbolService service;
    private final LocalidadPartidoService localidadPartidoService;

    public PartidoEndpoint(PartidoFutbolService service, LocalidadPartidoService localidadPartidoService) {
        this.service = service;
        this.localidadPartidoService = localidadPartidoService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerPartidosRequest")
    @ResponsePayload
    public ObtenerPartidosResponse obtenerPartidosAntesFechaActual(@RequestPayload ObtenerPartidosRequest request){
        ObtenerPartidosResponse response = new ObtenerPartidosResponse();
        List<PartidoRS> responseList = new ArrayList<>();
        List<PartidoFutbol> partidos = this.service.obtainPartidoAfterActualDate();
        try{
            partidos.forEach(c -> {
                responseList.add(PartidoRSTransform.buildPartidoRS(c));
            });
            response.setPartidosRS(responseList);
            return response;
        }catch (Exception ex){
            log.info("ex: {}",ex.getStackTrace());
            throw new RuntimeException();
        }
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerLocalidadesRequest")
    @ResponsePayload
    public ObtenerLocalidadesResponse obtenerLocalidades(@RequestPayload ObtenerLocalidadesRequest request){
        ObtenerLocalidadesResponse response = new ObtenerLocalidadesResponse();
        List<LocalidadRS> responseList = new ArrayList<>();
        List<LocalidadPartido> localidades = this.localidadPartidoService.obtainByCodigoPartidoAndGreaterThaZero(request.getCodigoPartido());
        try{
            localidades.forEach(c -> {
                responseList.add(LocalidadRSTransform.buildLocalidadRS(c));
            });
            response.setLocalidadS(responseList);
            return response;
        }catch (Exception ex){
            log.info("ex: {}",ex.getStackTrace());
            throw new RuntimeException();
        }
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "decrementarLocalidadeDisponibilidadRequest")
    @ResponsePayload
    public DecrementarLocalidadeDisponibilidadResponse decrementar(@RequestPayload DecrementarLocalidadeDisponibilidadRequest request){
        DecrementarLocalidadeDisponibilidadResponse response = new DecrementarLocalidadeDisponibilidadResponse();
        try{
            System.out.printf("Funca");
            return response;
        }catch (Exception ex){
            log.info("ex: {}",ex.getStackTrace());
            throw new RuntimeException();
        }
    }



}
