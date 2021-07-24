/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ContratoVenta;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface ContratoVentaDAO {
    
   public  void registrar (ContratoVenta contratoventa) throws Exception;
   public void actualizar (ContratoVenta contratoventa)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<ContratoVenta> listar()throws Exception;
   public ContratoVenta buscar (int id) throws Exception;
    
    
    
    
}
