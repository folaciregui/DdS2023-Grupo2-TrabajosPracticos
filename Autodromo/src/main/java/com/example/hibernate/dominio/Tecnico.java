package com.example.hibernate.dominio;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Tecnico extends Persona {
    @OneToMany(mappedBy = "tecnico")
    private List<Certificado> certificados;

    public void setCertificados(List<Certificado> certificados) {
        this.certificados = certificados;
    }
    public List<Certificado> getCertificados(){
        return certificados;
    }
}
