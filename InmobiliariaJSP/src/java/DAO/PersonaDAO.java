   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Persona;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface PersonaDAO {
    
   public  void registrar (Persona persona) throws Exception;
   public void actualizar (Persona persona)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<Persona> listar()throws Exception;
   public Persona buscar (int id) throws Exception;
    }
