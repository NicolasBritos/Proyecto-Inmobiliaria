/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Contrato;
import java.util.List;

/**
 *
 * @author Britos
 */
public interface ContratoDAO {
    
   public  void registrar (Contrato contrato) throws Exception;
   public void actualizar (Contrato contrato)throws Exception;
   public void eliminar (int id)throws Exception;
   public List<Contrato> listar()throws Exception;
   public Contrato buscar (int id) throws Exception;
    
    
}
