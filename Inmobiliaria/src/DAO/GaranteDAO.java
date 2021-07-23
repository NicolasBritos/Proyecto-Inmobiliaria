/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Garante;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface GaranteDAO {
    
   public  void registrar (Garante garante) throws Exception;
   public void actualizar (Garante garante)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<Garante> listar()throws Exception;
   public Garante buscar (int id) throws Exception;
    
    
    
}
