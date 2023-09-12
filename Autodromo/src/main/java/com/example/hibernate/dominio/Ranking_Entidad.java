package com.example.hibernate.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ranking_Entidad {
    @Id
    private Long id_ranking;

    @Id
    @ManyToOne
    private Entidad id_entidad;

    @Column
    @ManyToOne
    private Ranking_Promedios rankingPromedios;
    @Column
    @ManyToOne
    private Ranking_Impacto rankingImpacto;

    @Column
    @ManyToOne
    private Ranking_CantidadIncidentes rankingMayorCantidadIncidentes;
    @Column(name="posicion")
    private int posicion;
}
