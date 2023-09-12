package com.example.hibernate.dominio;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Table(name = "persona") //opcional
public class UsuarioGeneral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="correoElectronico")
    private String correoElectonico;
    @Column(name="apellido")
    private String apellido;
    @Column(name="nombre")
    private String nombre;
    @OneToOne
    @Column(name="cuenta")
    private Cuenta cuenta;

    @Column(name="tipoNotificacion")
    private String tipoNotificacion;
    @Column(name="frecuenciaNotificacion")
    private String frecuenciaNotificacion;

    @OneToOne
    @Column(name="empresaPrestadora")
    private Organizacion empresaInteres;
    @Column(name="verificado")
    private Boolean verificado;

    @Enumerated(EnumType.STRING) //Opcional. Por default, lo persiste como int
    private TipoDocumento tipoDocumento;

    public UsuarioGeneral(Long id, Integer dni, String apellido, String nombre, LocalDateTime fechaDeNacimiento, Integer pesoCorredor, Boolean verificado, TipoDocumento tipoDocumento) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.verificado = verificado;
        this.tipoDocumento = tipoDocumento;
    }

    public UsuarioGeneral() {

    }

    public Boolean getVerificado() {
        return verificado;
    }

    public void setVerificado(Boolean verificado) {
        this.verificado = verificado;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
