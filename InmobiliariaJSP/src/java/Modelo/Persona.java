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

@MappedSuperclass
public class Persona  implements Serializable{
    @Id
     private int dni;
    @Basic
 private String tipoDocumento;
 private  String apellido;
 private  String nombre;
 private String estadoCivil;
 private  String telefono;
 private String email;
   @Temporal(TemporalType.DATE)
   private Date fechaNacimiento;
   @OneToOne
   private  Direccion domicilio;

    public Persona(int dni, String tipoDocumento, String apellido, String nombre, String estadoCivil, String telefono, String email, Date fechaNacimiento, Direccion domicilio) {
        this.dni = dni;
        this.tipoDocumento = tipoDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
    }

 

    public Persona() {
    }
    
    
    

   

  

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", tipoDocumento=" + tipoDocumento + ", apellido=" + apellido + ", nombre=" + nombre + ", estadoCivil=" + estadoCivil + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + '}';
    }

    

  

    
    
    



    
}
