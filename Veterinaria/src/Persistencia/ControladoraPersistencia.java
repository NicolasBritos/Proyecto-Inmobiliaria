/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Britos
 */
public class ControladoraPersistencia {
    
    ClienteJpaController jpaCliente = new ClienteJpaController();
    
    public void altaCliente (Cliente client){
        
        try {
            jpaCliente.create(client);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
