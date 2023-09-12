package com.example.hibernate.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;

@Entity
public class Ranking_MayorCantidadIncidentes {
    @Id
    private Long id;
    @Column(name="fecha")
    private LocalDateTime fecha;

    @Column
    @OneToMany
    private Ranking_Entidad ranking_entidad;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
