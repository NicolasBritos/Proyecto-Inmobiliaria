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
public class ContratoAlquiler extends Contrato  implements Serializable{
        @Temporal(TemporalType.DATE)
  private  Date fechaFinalizacion;
     @Basic
   private int primerFechaPago;
   private int segundaFechaPago;
   private int duracion;
   private double aranceles;
    private double montoAlquiler;
     @OneToOne
  private  Inmueble inmueble;
     @OneToOne
   private Locador locador;
     @OneToOne
   private Locatario locatario;
     @OneToOne
 private   Garante garante;

    public ContratoAlquiler(Date fechaFinalizacion, int primerFechaPago, int segundaFechaPago, int duracion, double aranceles, double montoAlquiler, Inmueble inmueble, Locador locador, Locatario locatario, Garante garante, int idContrato, Date fechaContrato, double comision, double recargoFijo, double recargoProporcional, List<Boleta> boletas) {
        super(idContrato, fechaContrato, comision, recargoFijo, recargoProporcional, boletas);
        this.fechaFinalizacion = fechaFinalizacion;
        this.primerFechaPago = primerFechaPago;
        this.segundaFechaPago = segundaFechaPago;
        this.duracion = duracion;
        this.aranceles = aranceles;
        this.montoAlquiler = montoAlquiler;
        this.inmueble = inmueble;
        this.locador = locador;
        this.locatario = locatario;
        this.garante = garante;
    }

    public ContratoAlquiler(Date fechaFinalizacion, int primerFechaPago, int segundaFechaPago, int duracion, double aranceles, double montoAlquiler, Inmueble inmueble, Locador locador, Locatario locatario, Garante garante) {
        this.fechaFinalizacion = fechaFinalizacion;
        this.primerFechaPago = primerFechaPago;
        this.segundaFechaPago = segundaFechaPago;
        this.duracion = duracion;
        this.aranceles = aranceles;
        this.montoAlquiler = montoAlquiler;
        this.inmueble = inmueble;
        this.locador = locador;
        this.locatario = locatario;
        this.garante = garante;
    }

  

    public ContratoAlquiler() {
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
   


    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getAranceles() {
        return aranceles;
    }

    public void setAranceles(double aranceles) {
        this.aranceles = aranceles;
    }

    public double getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(double montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Locador getLocador() {
        return locador;
    }

    public void setLocador(Locador locador) {
        this.locador = locador;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Garante getGarante() {
        return garante;
    }

    public void setGarante(Garante garante) {
        this.garante = garante;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public String toString() {
        return "ContratoAlquiler{" + "fechaFinalizacion=" + fechaFinalizacion + ", primerFechaPago=" + primerFechaPago + ", segundaFechaPago=" + segundaFechaPago + ", duracion=" + duracion + ", aranceles=" + aranceles + ", montoAlquiler=" + montoAlquiler + ", inmueble=" + inmueble + ", locador=" + locador + ", locatario=" + locatario + ", garante=" + garante + '}';
    }


    
    


    

  
   

   
    
}
