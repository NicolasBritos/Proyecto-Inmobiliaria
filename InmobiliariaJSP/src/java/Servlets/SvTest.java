/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.Controlador;
import Modelo.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Britos
 */
@WebServlet(name = "SvTest", urlPatterns = {"/SvTest"})
public class SvTest extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ///Obtengo los datos del jsp
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
              ////Conexion con Controladora
        int existente = 0 ;
       Controlador controlador = new Controlador();   
       Boleta unaBoleta = new Boleta ();
       List <Boleta> listaBoletas = new LinkedList();
        try {
            existente = controlador.Validar(usuario, password);           /// valida que el usuario y contraseña coincidan
        } catch (Exception ex) {
            Logger.getLogger(SvTest.class.getName()).log(Level.SEVERE, null, ex);
        }
              if (existente != 0){
                                     try {
                listaBoletas = controlador.ObtenerBoletas(existente);
            } catch (Exception ex) {
                Logger.getLogger(SvTest.class.getName()).log(Level.SEVERE, null, ex);
            }
          
                                   ///sesion
        request.getSession().setAttribute("usuario", usuario);
        request.getSession().setAttribute("password", password);
        request.getSession().setAttribute("dni",existente);
        request.getSession().setAttribute("boletas", listaBoletas);
        response.sendRedirect("Pagina2.jsp");
       }
       
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
