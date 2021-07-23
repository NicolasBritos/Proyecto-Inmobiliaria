/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ControladoraPersistencia;




/**
 *
 * @author Britos
 */
public class Controladora {
    
  ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarCliente (int nro_cliente,String nombre, String raza,String color,String alergico,String atencionEsp,String nombreDueno,String celular,String observ){
       Cliente client = new Cliente();
       client.setNombre(nombre);
       client.setNro_cliente(nro_cliente);
       client.setRaza(raza);
       client.setColor(color);
       client.setAlergico(alergico);
       client.setAtencionEsp(atencionEsp);
       client.setNombreDueno(nombreDueno);
       client.setCelular(celular);
       client.setObserv(observ);
                       
        controlPersis.altaCliente(client);
    }
    
}
