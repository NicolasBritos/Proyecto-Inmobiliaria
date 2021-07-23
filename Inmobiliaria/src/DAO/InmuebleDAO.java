/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Inmueble;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface InmuebleDAO {
    
   public  void registrar (Inmueble inmueble) throws Exception;
   public void actualizar (Inmueble inmueble)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<Inmueble> listar()throws Exception;
   public Inmueble buscar (int id) throws Exception;
    
    
}
