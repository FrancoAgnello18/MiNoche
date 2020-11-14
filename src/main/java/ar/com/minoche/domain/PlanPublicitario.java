
package ar.com.minoche.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "planPublicitario")
public class PlanPublicitario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private double precio;
    
    @Column
    private int duracionDias;
    
    @Column
    private String alcance;

    @ManyToOne
    @JoinColumn(name = "administrador")
    Administrador administrador;
    
    @OneToMany(mappedBy = "planPublicitario")
    List<Publicidad> publicidadList;
}
