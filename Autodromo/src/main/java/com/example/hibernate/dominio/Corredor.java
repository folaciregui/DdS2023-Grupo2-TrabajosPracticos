package com.example.hibernate.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Corredor extends Persona {
    public Corredor(Long id, Integer dni, String apellido, String nombre, LocalDateTime fechaDeNacimiento, Integer pesoCorredor, Boolean verificado, TipoDocumento tipoDocumento) {
        super(id, dni, apellido, nombre, fechaDeNacimiento, pesoCorredor, verificado, tipoDocumento);
    }

    public Corredor() {
        super();
    }


    public void Correr(){

    }
}
