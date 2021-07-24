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
public class Locatario extends Persona  implements Serializable {
    @Basic
    private String usuario;
    private String password;
    private  String tipoActividad;
     @Lob
    private byte[] comprobante ;

    public Locatario(String usuario, String password, String tipoActividad, byte[] comprobante, int dni, String tipoDocumento, String apellido, String nombre, String estadoCivil, String telefono, String email, Date fechaNacimiento, Direccion domicilio) {
        super(dni, tipoDocumento, apellido, nombre, estadoCivil, telefono, email, fechaNacimiento, domicilio);
        this.usuario = usuario;
        this.password = password;
        this.tipoActividad = tipoActividad;
        this.comprobante = comprobante;
    }

    public Locatario(String usuario, String password, String tipoActividad, byte[] comprobante) {
        this.usuario = usuario;
        this.password = password;
        this.tipoActividad = tipoActividad;
        this.comprobante = comprobante;
    }

   


    public Locatario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getComprobante() {
        return comprobante;
    }

    public void setComprobante(byte[] comprobante) {
        this.comprobante = comprobante;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    @Override
    public String toString() {
        return "Locatario{" + "usuario=" + usuario + ", password=" + password + ", tipoActividad=" + tipoActividad + ", comprobante=" + comprobante + '}';
    }
    
    


    
}
