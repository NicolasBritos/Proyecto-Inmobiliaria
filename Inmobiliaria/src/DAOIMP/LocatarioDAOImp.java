/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.LocatarioDAO;
import Modelo.Locatario;
import Persistencia.LocatarioJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class LocatarioDAOImp implements LocatarioDAO{

    LocatarioJpaController locatariojpa = new LocatarioJpaController();
    
    @Override
    public void registrar(Locatario locatario) throws Exception {

locatariojpa.create(locatario);

    }

    @Override
    public void actualizar(Locatario locatario) throws Exception {

locatariojpa.edit(locatario);
        
    }

    @Override
    public void eliminar(int id) throws Exception {

locatariojpa.destroy(id);

    }

    @Override
    public List<Locatario> listar() throws Exception {

return locatariojpa.findLocatarioEntities();

    }

    @Override
    public Locatario buscar(int id) throws Exception {

return locatariojpa.findLocatario(id);
        
    }
    
}
