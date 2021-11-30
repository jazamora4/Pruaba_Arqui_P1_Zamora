package ec.edu.espe.arqsoftware.springsoapclient.config;

import ec.edu.espe.arqsoftware.springsoapclient.service.LocalidadPartidoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("ec.edu.espe.arqsoftware.springsoapclient.wsdl");
        return marshaller;
    }

    @Bean
    public LocalidadPartidoService localidadPartidoClient(Jaxb2Marshaller marshaller){
        LocalidadPartidoService localidadPartidoService = new LocalidadPartidoService();
        localidadPartidoService.setDefaultUri("http://localhost:8080/ws");
        localidadPartidoService.setMarshaller(marshaller);
        localidadPartidoService.setUnmarshaller(marshaller);
        return localidadPartidoService;
    }
}
