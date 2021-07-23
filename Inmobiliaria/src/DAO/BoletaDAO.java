/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Boleta;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface BoletaDAO {
    
   public  void registrar (Boleta boleta) throws Exception;
   public void actualizar (Boleta boleta)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<Boleta> listar()throws Exception;
   public Boleta buscar (int id) throws Exception;
    
}
