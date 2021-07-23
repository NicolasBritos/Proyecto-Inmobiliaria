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
public class Locador extends Persona  implements Serializable {
    
        public Locador(int dni, String tipoDocumento, String apellido, String nombre, String estadoCivil, String telefono, String email, Date fechaNacimiento, Direccion domicilio) {
        super(dni, tipoDocumento, apellido, nombre, estadoCivil, telefono, email, fechaNacimiento, domicilio);
    }

    public Locador() {
    }




    
}
