package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;
public class Multa {
    private Date fechaFinDeMulta;
    public Date getDiaFinal(){
        return fechaFinDeMulta;
    }
    public void actualizarMulta(Date diaNuevo){
        fechaFinDeMulta = diaNuevo;
    }
}
