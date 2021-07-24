/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Britos
 */
@Entity
public class Cuota implements Serializable {
   @Id
   private int idCuota;
   @Basic
   private double monto;
   
    public Cuota(int idCronograma, int idCuota, double monto) {
        this.idCuota = idCuota;
        this.monto = monto;
    }

    public Cuota() {
    }
    
    

         public int getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(int idCuota) {
        this.idCuota = idCuota;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Cuota{, idCuota=" + idCuota + ", monto=" + monto + '}';
    }
    
}
