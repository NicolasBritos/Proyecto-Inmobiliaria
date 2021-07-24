/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.GaranteDAO;
import Modelo.Garante;
import Persistencia.GaranteJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class GaranteDAOImp implements GaranteDAO {

    GaranteJpaController garantejpa = new GaranteJpaController();
    @Override
    public void registrar(Garante garante) throws Exception {

     garantejpa.create(garante);

    }

    @Override
    public void actualizar(Garante garante) throws Exception {

garantejpa.edit(garante);

    }

    @Override
    public void eliminar(int id) throws Exception {

garantejpa.destroy(id);

    }

    @Override
    public List<Garante> listar() throws Exception {

return garantejpa.findGaranteEntities();
        
    }

    @Override
    public Garante buscar(int id) throws Exception {

return garantejpa.findGarante(id);

    }
    
}
