package ec.edu.espe.arqsoftware.springsoapserver.transform;

import ec.edu.espe.arqsoftware.springsoapserver.model.LocalidadPartido;
import ec.edu.espe.arqsoftware.springsoapserver.ws.LocalidadRS;

public class LocalidadRSTransform {
    public static LocalidadRS buildLocalidadRS(LocalidadPartido localidadPartido){
        try{
            return LocalidadRS.builder()
                    .codigo(localidadPartido.getCodigoLocalidad())
                    .precio(localidadPartido.getPrecio())
                    .build();
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    }
}
