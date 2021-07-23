/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.CronogramaPagos;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface CronogramaPagosDAO {
    
   public  void registrar (CronogramaPagos cronogramapagos) throws Exception;
   public void actualizar (CronogramaPagos cronogramapagos)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<CronogramaPagos> listar()throws Exception;
   public CronogramaPagos buscar (int id) throws Exception;
    
    
    
    
}
