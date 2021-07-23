/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ContratoAlquiler;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface ContratoAlquilerDAO {
    
    public  void registrar (ContratoAlquiler contratoalquiler) throws Exception;
   public void actualizar (ContratoAlquiler contratoalquiler)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<ContratoAlquiler> listar()throws Exception;
   public ContratoAlquiler buscar (int id) throws Exception;
    
    
}
