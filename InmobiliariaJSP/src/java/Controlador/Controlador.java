/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import DAOIMP.*;
import Modelo.*;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Britos
 */
public class Controlador {
    private Locatario locatario;
    private Boleta boleta;
    
    // Se instancian las clases DAO
BoletaDAOImp boletaDAO = new BoletaDAOImp ();
ContratoAlquilerDAOImp contratoalquilerDAO = new ContratoAlquilerDAOImp ();
ContratoVentaDAOImp contratoaentaDAO = new ContratoVentaDAOImp ();
CronogramaPagosDAOImp cronogramapagosDAO = new CronogramaPagosDAOImp ();
CuotaDAOImp cuotaDAO= new CuotaDAOImp ();
DireccionDAOImp direccionDAO = new DireccionDAOImp ();
GaranteDAOImp garanteDAO = new GaranteDAOImp ();
InmuebleDAOImp inmuebleDAO= new InmuebleDAOImp ();
LocadorDAOImp  locadorDAO= new LocadorDAOImp ();
LocatarioDAOImp locatarioDAO = new LocatarioDAOImp ();

    
/////////////////////////////////////////////////////////////////////


//Creacion de listas

    List<Boleta> ListBoletas = new LinkedList();
    List<Locatario> ListLocatarios= new LinkedList();
    List<Contrato> ListContratos = new LinkedList();
    List<ContratoVenta> ListVentas = new LinkedList();
    List<ContratoAlquiler> ListAlquileres = new LinkedList();
    List<CronogramaPagos> ListCronogramas = new LinkedList();
    List<Cuota> ListCuotas = new LinkedList();
    List<Direccion> ListDirecciones = new LinkedList();
    List<Garante> ListGarantes = new LinkedList();
    List<Inmueble> ListInmuebles = new LinkedList();
    List<Locador> ListLocadores = new LinkedList();
    List<Persona> ListPersonas = new LinkedList();
    
/////////////////////////////////////////////////////////////////    
    
    
    public int Validar (String usuario, String password) throws Exception{
        int  retorno = 0;
        ListLocatarios = locatarioDAO.listar();
         Locatario unLocatario = new Locatario();
        for (int contador = 0; contador <= ListLocatarios.size(); contador++){
            unLocatario = ListLocatarios.get(contador);     
            String user = unLocatario.getUsuario();
            String pass = unLocatario.getPassword();
                if (usuario.equals(user) &&  pass.equals(password)){                       
                      retorno = unLocatario.getDni();
                   contador = (ListLocatarios.size()+1);  //fuerza para salir del bucle
                }
        }
        return retorno;
                    }
    
    
    public int BuscarLocatario (){
       int encontrado;
            encontrado =locatario.getDni();
                return encontrado;
    }
    
    
    public List <Boleta> ObtenerBoletas (int dni) throws Exception{
          List <Boleta> listaBoletas = new LinkedList();
          ListBoletas = boletaDAO.listar();
                        for (Boleta unaBoleta: ListBoletas){
                   int dniBoleta = unaBoleta.getDniLocatario();
                    if ( dni == dniBoleta){                 
                              listaBoletas.add(unaBoleta);
                                                    
                                    }
        }
        
                      return listaBoletas;
    }
    
     
    
    
    
    
    
 
    
}
