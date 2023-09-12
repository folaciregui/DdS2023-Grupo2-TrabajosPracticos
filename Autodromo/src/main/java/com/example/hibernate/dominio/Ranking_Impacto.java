package com.example.hibernate.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;

@Entity
public class Ranking_Impacto {
    @Id
    private Long id_Impacto;
    @Column(name="fecha")
    private LocalDateTime fecha;

    @Column
    @OneToMany
    private Ranking_Entidad ranking_entidad;
    public void setId_Impacto(Long idImpacto) {
        this.id_Impacto = idImpacto;
    }

    public Long getId_Impacto() {
        return id_Impacto;
    }
}
