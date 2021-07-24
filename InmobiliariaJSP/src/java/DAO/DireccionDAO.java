/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Direccion;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface DireccionDAO {
    
   public  void registrar (Direccion direccion) throws Exception;
   public void actualizar (Direccion direccion)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<Direccion> listar()throws Exception;
   public Direccion buscar (int id) throws Exception;
    
    
    
}
