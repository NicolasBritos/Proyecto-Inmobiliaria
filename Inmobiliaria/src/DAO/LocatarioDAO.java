/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Locatario;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface LocatarioDAO {
    
   public  void registrar (Locatario locatario) throws Exception;
   public void actualizar (Locatario locatario)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<Locatario> listar()throws Exception;
   public Locatario buscar (int id) throws Exception;
    
    
    
}
