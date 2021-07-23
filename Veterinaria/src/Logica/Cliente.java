/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author Britos
 */
@Entity
public class Cliente implements Serializable {
    @Id
    private int nro_cliente;
    @Basic
    private String nombre;
    private String Raza;
    private String Color;
    private String alergico;
    private String atencionEsp;
    private String nombreDueno;
    private String celular;
    private String Observ;

    public Cliente(int nro_cliente, String nombre, String Raza, String Color, String alergico, String atencionEsp, String nombreDueno, String celular, String Observ) {
        this.nro_cliente = nro_cliente;
        this.nombre = nombre;
        this.Raza = Raza;
        this.Color = Color;
        this.alergico = alergico;
        this.atencionEsp = atencionEsp;
        this.nombreDueno = nombreDueno;
        this.celular = celular;
        this.Observ = Observ;
    }
    public  Cliente (){
    }

    public int getNro_cliente() {
        return nro_cliente;
    }

    public void setNro_cliente(int nro_cliente) {
        this.nro_cliente = nro_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEsp() {
        return atencionEsp;
    }

    public void setAtencionEsp(String atencionEsp) {
        this.atencionEsp = atencionEsp;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObserv() {
        return Observ;
    }

    public void setObserv(String Observ) {
        this.Observ = Observ;
    }

   
   

}