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
@MappedSuperclass
  public class Contrato implements Serializable {
    @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
  private  int idContrato;
    @Temporal(TemporalType.DATE)
   private Date fechaContrato;
    @Basic
  private double comision;
  private double recargoFijo;
  private  double recargoProporcional;
  @OneToMany
  private List<Boleta> boletas ;

    public Contrato(int idContrato, Date fechaContrato, double comision, double recargoFijo, double recargoProporcional, List<Boleta> boletas) {
        this.idContrato = idContrato;
        this.fechaContrato = fechaContrato;
        this.comision = comision;
        this.recargoFijo = recargoFijo;
        this.recargoProporcional = recargoProporcional;
        this.boletas = boletas;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

  

    public Contrato() {
    }
    



    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
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

    public List<Boleta> getBoletas() {
        return boletas;
    }

    public void setBoletas(List<Boleta> boletas) {
        this.boletas = boletas;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", fechaContrato=" + fechaContrato + ", comision=" + comision + ", recargoFijo=" + recargoFijo + ", recargoProporcional=" + recargoProporcional + ", boletas=" + boletas + '}';
    }

    

   


}
