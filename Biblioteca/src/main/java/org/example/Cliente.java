package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

import java.util.List;

public class Cliente {
    private Multa multa;
    public Multa devolverMultaConFechaMasLejana(Date fechaNuevaMulta){
        if (multa.getDiaFinal().compareTo(fechaNuevaMulta)<0){
            multa.actualizarMulta(fechaNuevaMulta);
        };
        return multa;
    }
    public void setMulta(Multa nuevaMulta){
        multa= nuevaMulta;
    }
    public Multa getMulta(){
        return multa;
    }
    public Multa calcularMayorMulta(Prestamo prestamo){
        if(prestamo.estaVencido()){
           Date fecha = prestamo.calcularFechaDeMulta();
           multa= this.devolverMultaConFechaMasLejana(fecha);
       }
        return multa;
    }
}
