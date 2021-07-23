/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Cuota;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface CuotaDAO {
    
   public  void registrar (Cuota cuota) throws Exception;
   public void actualizar (Cuota cuota)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<Cuota> listar()throws Exception;
   public Cuota buscar (int id) throws Exception;
    
    
    
}
