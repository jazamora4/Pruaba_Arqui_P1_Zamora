package ec.edu.espe.arqsoftware.springsoapclient.service;

import ec.edu.espe.arqsoftware.springsoapclient.wsdl.ObtenerLocalidadesRequest;
import ec.edu.espe.arqsoftware.springsoapclient.wsdl.ObtenerLocalidadesResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class LocalidadPartidoService extends WebServiceGatewaySupport {
    private String endpoint = "http://localhost:8080/ws/partido.wsdl";

    public ObtenerLocalidadesResponse obtenerLocalidades(String codigoPartido){
        ObtenerLocalidadesRequest request = new ObtenerLocalidadesRequest();
        request.setCodigoPartido(codigoPartido);
        return (ObtenerLocalidadesResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
