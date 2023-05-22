package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Gestor{
    private Cliente cliente;
    public Date cerrarPrestamo(Prestamo prestamo){
       Multa multa = cliente.calcularMayorMulta(prestamo);
       return multa.getDiaFinal();
    }
}