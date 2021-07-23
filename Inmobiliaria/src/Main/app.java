/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.Controlador;
import Vista.MenuPrincipal;


/**
 *
 * @author Britos
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador controlador = new Controlador ();
        MenuPrincipal pantalla = new MenuPrincipal(controlador);
        pantalla.setVisible(true);
           pantalla.setLocationRelativeTo(null);


    }
    
}
