/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.InmuebleDAO;
import Modelo.Inmueble;
import Persistencia.InmuebleJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class InmuebleDAOImp implements InmuebleDAO {
    
    InmuebleJpaController inmueblejpa = new InmuebleJpaController();
    
    @Override
    public void registrar(Inmueble inmueble) throws Exception {

      inmueblejpa.create(inmueble);

    }

    @Override
    public void actualizar(Inmueble inmueble) throws Exception {

        inmueblejpa.edit(inmueble);

    }

    @Override
    public void eliminar(int id) throws Exception {

        inmueblejpa.destroy(id);

    }

    @Override
    public List<Inmueble> listar() throws Exception {

return inmueblejpa.findInmuebleEntities();
        
    }

    @Override
    public Inmueble buscar(int id) throws Exception {

       return  inmueblejpa.findInmueble(id);

    }
    
}
