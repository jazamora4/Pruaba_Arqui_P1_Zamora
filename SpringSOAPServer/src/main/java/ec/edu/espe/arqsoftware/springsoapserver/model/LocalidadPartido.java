package ec.edu.espe.arqsoftware.springsoapserver.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table(name = "localidad_partido")
public class LocalidadPartido {
    @Id
    @Column(name = "codigo_localidad")
    private String codigoLocalidad;
    @Column(name = "disponibilidad")
    private Integer disponibilidad;
    @Column(name = "precio")
    private BigDecimal precio;
    @JoinColumn(name = "codigo", referencedColumnName = "codigo")
    @ManyToOne(fetch = FetchType.EAGER)
    private PartidoFutbol codigoPartido;
}
