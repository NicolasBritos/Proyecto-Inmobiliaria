/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.LocadorDAO;
import Modelo.Locador;
import Persistencia.LocadorJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class LocadorDAOImp implements LocadorDAO{

    LocadorJpaController locadorjpa = new LocadorJpaController();
    
    @Override
    public void registrar(Locador locador) throws Exception {

locadorjpa.create(locador);

    }

    @Override
    public void actualizar(Locador locador) throws Exception {

        locadorjpa.edit(locador);

    }

    @Override
    public void eliminar(int id) throws Exception {

locadorjpa.destroy(id);

    }

    @Override
    public List<Locador> listar() throws Exception {

return locadorjpa.findLocadorEntities();

    }

    @Override
    public Locador buscar(int id) throws Exception {

return locadorjpa.findLocador(id);

    }
    
}
