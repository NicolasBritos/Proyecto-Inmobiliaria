/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Britos
 */
@Entity
public class CronogramaPagos implements Serializable {
    @Id
   private int idCronograma;
      @ManyToMany
   private List<Cuota> cuotas ;
    @Temporal(TemporalType.DATE)
  private  Date primerFechaPago;
    @Temporal(TemporalType.DATE)
  private  Date segundaFechaPago;

    public CronogramaPagos(int idCronograma, List<Cuota> cuotas, Date primerFechaPago, Date segundaFechaPago) {
        this.idCronograma = idCronograma;
        this.cuotas = cuotas;
        this.primerFechaPago = primerFechaPago;
        this.segundaFechaPago = segundaFechaPago;
    }

    public CronogramaPagos() {
    }


  
 

    public int getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(int idCronograma) {
        this.idCronograma = idCronograma;
    }

    public Date getPrimerFechaPago() {
        return primerFechaPago;
    }

    public void setPrimerFechaPago(Date primerFechaPago) {
        this.primerFechaPago = primerFechaPago;
    }

    public Date getSegundaFechaPago() {
        return segundaFechaPago;
    }

    public void setSegundaFechaPago(Date segundaFechaPago) {
        this.segundaFechaPago = segundaFechaPago;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

   
    
    
}
