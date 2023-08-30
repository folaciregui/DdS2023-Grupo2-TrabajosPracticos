package com.example.hibernate.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Certificado {
    @Column
    private LocalDateTime fecha;
    @Column
    private String historialCertificado;
    @Column
    private String nombre;
    @Id
    private Long id;

    public String getHistorialCertificado() {
        return historialCertificado;
    }

    public void setHistorialCertificado(String historialCertificado) {
        this.historialCertificado = historialCertificado;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
