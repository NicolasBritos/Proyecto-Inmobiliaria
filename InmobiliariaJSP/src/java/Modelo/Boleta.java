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
public class Boleta implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)  
 private int idBoleta;
  @Temporal(TemporalType.DATE)
 private Date primerVencimiento;
   @Temporal(TemporalType.DATE)
 private Date segundoVencimiento;
    @Temporal(TemporalType.DATE)
 private Date fechaBoleta;
  @Basic
  private int dniLocatario;
  private String nombreLocatario;
  private double recargoFijo;
  private double recargoProporcional;
  private  double total;
  private   String descripcion;
  private boolean estadoPago;

    public Boleta(int idBoleta, Date primerVencimiento, Date segundoVencimiento, Date fechaBoleta, int dniLocatario, String nombreLocatario, double recargoFijo, double recargoProporcional, double total, String descripcion, boolean estadoPago) {
        this.idBoleta = idBoleta;
        this.primerVencimiento = primerVencimiento;
        this.segundoVencimiento = segundoVencimiento;
        this.fechaBoleta = fechaBoleta;
        this.dniLocatario = dniLocatario;
        this.nombreLocatario = nombreLocatario;
        this.recargoFijo = recargoFijo;
        this.recargoProporcional = recargoProporcional;
        this.total = total;
        this.descripcion = descripcion;
        this.estadoPago = estadoPago;
    }





  


 

    public Boleta() {
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public Date getPrimerVencimiento() {
        return primerVencimiento;
    }

    public void setPrimerVencimiento(Date primerVencimiento) {
        this.primerVencimiento = primerVencimiento;
    }

    public Date getSegundoVencimiento() {
        return segundoVencimiento;
    }

    public void setSegundoVencimiento(Date segundoVencimiento) {
        this.segundoVencimiento = segundoVencimiento;
    }

    public Date getFechaBoleta() {
        return fechaBoleta;
    }

    public void setFechaBoleta(Date fechaBoleta) {
        this.fechaBoleta = fechaBoleta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public double getRecargoFijo() {
        return recargoFijo;
    }

    public void setRecargoFijo(double recargoFijo) {
        this.recargoFijo = recargoFijo;
    }

    public double getRecargoProporcional() {
        return recargoProporcional;
    }

    public void setRecargoProporcional(double recargoProporcional) {
        this.recargoProporcional = recargoProporcional;
    }

    public int getDniLocatario() {
        return dniLocatario;
    }

    public void setDniLocatario(int dniLocatario) {
        this.dniLocatario = dniLocatario;
    }

    public String getNombreLocatario() {
        return nombreLocatario;
    }

    public void setNombreLocatario(String nombreLocatario) {
        this.nombreLocatario = nombreLocatario;
    }

    @Override
    public String toString() {
        return "Boleta{" + "idBoleta=" + idBoleta + ", primerVencimiento=" + primerVencimiento + ", segundoVencimiento=" + segundoVencimiento + ", fechaBoleta=" + fechaBoleta + ", dniLocatario=" + dniLocatario + ", nombreLocatario=" + nombreLocatario + ", recargoFijo=" + recargoFijo + ", recargoProporcional=" + recargoProporcional + ", total=" + total + ", descripcion=" + descripcion + ", estadoPago=" + estadoPago + '}';
    }

    
   
   


    
      
   
    

  
    
}
