/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.ContratoAlquilerDAO;
import Modelo.ContratoAlquiler;
import Persistencia.ContratoAlquilerJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class ContratoAlquilerDAOImp implements ContratoAlquilerDAO {
    
    ContratoAlquilerJpaController contratoalquilerjpa = new ContratoAlquilerJpaController();

    @Override
    public void registrar(ContratoAlquiler contratoalquiler) throws Exception {
        
   contratoalquilerjpa.create(contratoalquiler);
    }

    @Override
    public void actualizar(ContratoAlquiler contratoalquiler) throws Exception {
        
   contratoalquilerjpa.edit(contratoalquiler);
    }

    @Override
    public void eliminar(int id) throws Exception {
contratoalquilerjpa.destroy(id);
    }

    @Override
    public List<ContratoAlquiler> listar() throws Exception {
 
        return contratoalquilerjpa.findContratoAlquilerEntities();
    }

    @Override
    public ContratoAlquiler buscar(int id) throws Exception {
        
   return  contratoalquilerjpa.findContratoAlquiler(id);
        }
    
}
