/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Locador;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface LocadorDAO {
    
   public  void registrar (Locador locador) throws Exception;
   public void actualizar (Locador locador)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<Locador> listar()throws Exception;
   public Locador buscar (int id) throws Exception;
    
    
    
}
