package ec.edu.espe.arqsoftware.springsoapserver.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "partido_futbol")
public class PartidoFutbol {
    @Id
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "equipo_local")
    private String equipoLocal;
    @Column(name = "equipo_visita")
    private String equipoVisita;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "lugar")
    private String lugar;
    @OneToMany(mappedBy = "codigoPartido", fetch = FetchType.EAGER)
    private List<LocalidadPartido> localidadPartido;
}
