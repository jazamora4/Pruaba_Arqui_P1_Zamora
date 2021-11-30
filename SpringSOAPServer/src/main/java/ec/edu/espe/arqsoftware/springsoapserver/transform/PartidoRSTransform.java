package ec.edu.espe.arqsoftware.springsoapserver.transform;

import ec.edu.espe.arqsoftware.springsoapserver.model.PartidoFutbol;
import ec.edu.espe.arqsoftware.springsoapserver.ws.PartidoRS;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

public class PartidoRSTransform {
    public static PartidoRS buildPartidoRS(PartidoFutbol partido){
        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(partido.getFecha());
            XMLGregorianCalendar fechaGregorian = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            return PartidoRS.builder()
                    .codigo(partido.getCodigo())
                    .equipoLocal(partido.getEquipoLocal())
                    .equipoVisita(partido.getEquipoVisita())
                    .lugar(partido.getLugar())
                    .fecha(fechaGregorian)
                    .build();
        } catch (Exception ex) {
            ex.getStackTrace();
            throw new RuntimeException();
        }
    }
}
