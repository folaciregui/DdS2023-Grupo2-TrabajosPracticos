package com.example.hibernate.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;

@Entity
public class Ranking_Promedios {
    @Id
    private Long id_ranking_promiedos;
    @Column(name="fecha")
    private LocalDateTime fecha;

    @Column
    @OneToMany
    private Ranking_Entidad ranking_entidad;
    public void setId_ranking_promiedos(Long idRankingPromiedos) {
        this.id_ranking_promiedos = idRankingPromiedos;
    }

    public Long getId_ranking_promiedos() {
        return id_ranking_promiedos;
    }
}
