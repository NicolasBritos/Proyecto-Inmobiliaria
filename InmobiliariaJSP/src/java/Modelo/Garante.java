/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Britos
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "DNI")
public class Garante extends Persona {
@Basic
 private  String tipoActividad;
         @Lob
 private byte[] comprobante ;

    public Garante(String tipoActividad, byte[] comprobante, int dni, String tipoDocumento, String apellido, String nombre, String estadoCivil, String telefono, String email, Date fechaNacimiento, Direccion domicilio) {
        super(dni, tipoDocumento, apellido, nombre, estadoCivil, telefono, email, fechaNacimiento, domicilio);
        this.tipoActividad = tipoActividad;
        this.comprobante = comprobante;
    }

    public Garante(String tipoActividad, byte[] comprobante) {
        this.tipoActividad = tipoActividad;
        this.comprobante = comprobante;
    }

               
             public Garante() {
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public byte[] getComprobante() {
        return comprobante;
    }

    public void setComprobante(byte[] comprobante) {
        this.comprobante = comprobante;
    }

    @Override
    public String toString() {
        return "Garante{" + "tipoActividad=" + tipoActividad + ", comprobante=" + comprobante + '}';
    }

   



 
   

     

           
}
