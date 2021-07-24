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
public class Inmueble implements Serializable {
    @Id
    private  int idInmueble;
    @Basic
    private String tipoInmueble;
    @OneToOne
    private Direccion  direccion;

    public Inmueble(int idInmueble, String tipoInmueble, Direccion direccion) {
        this.idInmueble = idInmueble;
        this.tipoInmueble = tipoInmueble;
        this.direccion = direccion;
    }

 
    
    public Inmueble() {
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

       
    public int getIdInmueble() {
        return idInmueble;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "idInmueble=" + idInmueble + ", tipoInmueble=" + tipoInmueble + ", direccion=" + direccion + '}';
    }
    
}
