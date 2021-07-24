/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.DireccionDAO;
import Modelo.Direccion;
import Persistencia.DireccionJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class DireccionDAOImp implements DireccionDAO{

    DireccionJpaController direccionjpa = new DireccionJpaController();
    
    @Override
    public void registrar(Direccion direccion) throws Exception {

direccionjpa.create(direccion);

    }

    @Override
    public void actualizar(Direccion direccion) throws Exception {

direccionjpa.edit(direccion);

    }

    @Override
    public void eliminar(int id) throws Exception {

direccionjpa.destroy(id);

    }

    @Override
    public List<Direccion> listar() throws Exception {

return direccionjpa.findDireccionEntities();
        
    }

    @Override
    public Direccion buscar(int id) throws Exception {

return direccionjpa.findDireccion(id);
        
    }
    
}
