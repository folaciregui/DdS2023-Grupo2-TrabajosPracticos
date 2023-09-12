package com.example.hibernate.dominio;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Organizacion {

    @Id
    private Long cuit;

    @Column(name="tipoOrganizacion")
    private String tipoOrganizacion;

    @Column(name="nombre")
    private String nombre;

    @OneToOne
    @Column(name="personaACargo")
    private UsuarioGeneral personaACargo;

    public void setId(Long id) {
        this.cuit = id;
    }

    public Long getId() {
        return cuit;
    }
}
