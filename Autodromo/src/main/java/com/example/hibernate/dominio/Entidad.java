package com.example.hibernate.dominio;


import javax.persistence.*;
import java.security.Identity;

@Entity
public class Entidad {

    @Id
    private Long id_entidad;
    @Column(name="nombre")
    private String nombre;
    @Column
    @ManyToOne
    private Organizacion empresaPrestadora;
    @Column
    @ManyToOne
    private Organizacion organismoDeControl;
    @Column(name="tipoEntidad")
    private String tipoEntidad;
    @Column(name="medioTransporte")
    private String tipoMedio;

    public void setId_entidad(Long idEntidad) {
        this.id_entidad = idEntidad;
    }

    public Long getId_entidad() {
        return id_entidad;
    }
}
