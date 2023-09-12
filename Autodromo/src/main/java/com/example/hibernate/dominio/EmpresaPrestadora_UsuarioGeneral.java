package com.example.hibernate.dominio;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.security.Identity;

@Entity
public class EmpresaPrestadora_UsuarioGeneral {

    @Id
    @ManyToOne
    private UsuarioGeneral usuarioGeneral;
    @Id
    @ManyToOne
    private Organizacion empresaPrestadora;

}
