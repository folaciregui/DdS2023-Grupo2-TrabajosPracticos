package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

public class Prestamo {
    private Date fechaDeRetiro;
    private Date fechaDeDevolucion;
    private Date fechaDeVencimiento;
    public Boolean estaVencido(){
        return (fechaDeVencimiento.compareTo(fechaDeDevolucion)<0);
    }
    public Date calcularFechaDeMulta(){
        Long diasExtra =fechaDeDevolucion.getTime() - fechaDeVencimiento.getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaDeDevolucion);
        diasExtra= diasExtra*2;
        calendar.add(Calendar.DAY_OF_YEAR, diasExtra.intValue());
        return calendar.getTime();
    }
}
