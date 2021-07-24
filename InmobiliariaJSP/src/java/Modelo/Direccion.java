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
public class Direccion implements Serializable {
    @Id
  private  int idDireccion;
    @Basic
  private String calle;
  private  String numero;
  private  int piso;
  private  String barrio;
  private String localidad;
  private int codPostal;

    public Direccion(int idDireccion, String calle, String numero, int piso, String barrio, String localidad, int codPostal) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.barrio = barrio;
        this.localidad = localidad;
        this.codPostal = codPostal;
    }

  

    public Direccion() {
    }
    

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" + "idDireccion=" + idDireccion + ", calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", barrio=" + barrio + ", localidad=" + localidad + ", codPostal=" + codPostal + '}';
    }
    
    


    
}
