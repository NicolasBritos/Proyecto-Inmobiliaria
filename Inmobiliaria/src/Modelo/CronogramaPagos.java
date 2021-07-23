/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Britos
 */
@Entity
public class CronogramaPagos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
   private int idCronograma;
     @Basic
  int primerFechaPago;
     int segundaFechaPago;
      private int cuotas ;

    public CronogramaPagos() {
    }

    public CronogramaPagos(int idCronograma, int primerFechaPago, int segundaFechaPago, int cuotas) {
        this.idCronograma = idCronograma;
        this.primerFechaPago = primerFechaPago;
        this.segundaFechaPago = segundaFechaPago;
        this.cuotas = cuotas;
    }



 
 

    public int getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(int idCronograma) {
        this.idCronograma = idCronograma;
    }

    public int getPrimerFechaPago() {
        return primerFechaPago;
    }

    public void setPrimerFechaPago(int primerFechaPago) {
        this.primerFechaPago = primerFechaPago;
    }

    public int getSegundaFechaPago() {
        return segundaFechaPago;
    }

    public void setSegundaFechaPago(int segundaFechaPago) {
        this.segundaFechaPago = segundaFechaPago;
    }

    

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "CronogramaPagos{" + "idCronograma=" + idCronograma + ", primerFechaPago=" + primerFechaPago + ", segundaFechaPago=" + segundaFechaPago + ", cuotas=" + cuotas + '}';
    }


   
    
    
}
