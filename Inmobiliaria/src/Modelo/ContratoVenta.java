/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Britos
 */
@Entity
public class ContratoVenta extends Contrato {
    @Basic
  private  double montoVenta;
    @OneToOne
   private Inmueble inmueble;
    @OneToOne
  private  CronogramaPagos cronograma;
    @OneToOne
  private  Locador locador;
    @OneToOne
  private  Locatario locatario;

    public ContratoVenta(double montoVenta, Inmueble inmueble, CronogramaPagos cronograma, Locador locador, Locatario locatario, int idContrato, Date fechaContrato, double comision, double recargoFijo, double recargoProporcional, List<Boleta> boletas) {
        super(idContrato, fechaContrato, comision, recargoFijo, recargoProporcional, boletas);
        this.montoVenta = montoVenta;
        this.inmueble = inmueble;
        this.cronograma = cronograma;
        this.locador = locador;
        this.locatario = locatario;
    }

    public ContratoVenta(double montoVenta, Inmueble inmueble, CronogramaPagos cronograma, Locador locador, Locatario locatario) {
        this.montoVenta = montoVenta;
        this.inmueble = inmueble;
        this.cronograma = cronograma;
        this.locador = locador;
        this.locatario = locatario;
    }


    public ContratoVenta() {
    }
    
    



    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public CronogramaPagos getCronograma() {
        return cronograma;
    }

    public void setCronograma(CronogramaPagos cronograma) {
        this.cronograma = cronograma;
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

    @Override
    public String toString() {
        return "ContratoVenta{" + "montoVenta=" + montoVenta + ", inmueble=" + inmueble + ", cronograma=" + cronograma + ", locador=" + locador + ", locatario=" + locatario + '}';
    }
    
}
