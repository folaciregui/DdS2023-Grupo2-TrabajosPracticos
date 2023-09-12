package com.example.hibernate.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Cuenta {
    @Id
    private Long id;

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }

    private List<Corredor> corredores;

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    private List<Tecnico> tecnicos;

    public List<UsuarioGeneral> getPersonas() {
        return personas;
    }

    public void setPersonas(List<UsuarioGeneral> personas) {
        this.personas = personas;
    }

    private List<UsuarioGeneral> personas;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
