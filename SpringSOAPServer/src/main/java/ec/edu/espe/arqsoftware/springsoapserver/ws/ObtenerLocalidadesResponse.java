//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:20:42 PM COT 
//


package ec.edu.espe.arqsoftware.springsoapserver.ws;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocalidadS" type="{http://espe.edu.ec/arqsoftware/SpringSOAPServer/ws}LocalidadRS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "localidadS"
})
@XmlRootElement(name = "obtenerLocalidadesResponse")
@Setter
public class ObtenerLocalidadesResponse {

    @XmlElement(name = "LocalidadS")
    protected List<LocalidadRS> localidadS;

    /**
     * Gets the value of the localidadS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localidadS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalidadS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalidadRS }
     * 
     * 
     */
    public List<LocalidadRS> getLocalidadS() {
        if (localidadS == null) {
            localidadS = new ArrayList<LocalidadRS>();
        }
        return this.localidadS;
    }

}
