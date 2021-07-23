/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.ContratoDAO;
import Modelo.Contrato;
import Persistencia.ContratoJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class ContratoDAOImp implements ContratoDAO {

    ContratoJpaController contratojpa = new ContratoJpaController();
    @Override
    public void registrar(Contrato contrato) throws Exception {

contratojpa.create(contrato);
    }

    @Override
    public void actualizar(Contrato contrato) throws Exception {

        contratojpa.edit(contrato);
        
    }

    @Override
    public void eliminar(int id) throws Exception {
        
contratojpa.destroy(id);

        }

    @Override
    public List<Contrato> listar() throws Exception {
        
       return contratojpa.findContratoEntities();
    }

    @Override
    public Contrato buscar(int id) throws Exception {

        return contratojpa.findContrato(id);

    }
    
}
