package com.example.hibernate.dominio;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Table(name = "persona") //opcional
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="dni")
    private Integer dni;
    @Column(name="apellido")
    private String apellido;
    @Column(name="nombre")
    private String nombre;
    @Column(name="fechaDeNacimiento")
    private LocalDateTime fechaDeNacimiento;

    @Column(name="pesoCorredor")
    private Integer pesoCorredor;

    @Column(name="verificado")
    private Boolean verificado;

    @Enumerated(EnumType.STRING) //Opcional. Por default, lo persiste como int
    private TipoDocumento tipoDocumento;

    public Persona(Long id, Integer dni, String apellido, String nombre, LocalDateTime fechaDeNacimiento, Integer pesoCorredor, Boolean verificado, TipoDocumento tipoDocumento) {
        this.id = id;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.pesoCorredor = pesoCorredor;
        this.verificado = verificado;
        this.tipoDocumento = tipoDocumento;
    }

    public Persona() {

    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public LocalDateTime getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getPesoCorredor() {
        return pesoCorredor;
    }

    public void setPesoCorredor(Integer pesoCorredor) {
        this.pesoCorredor = pesoCorredor;
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
