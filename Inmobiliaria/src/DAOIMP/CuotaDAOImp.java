/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.CuotaDAO;
import Modelo.Cuota;
import Persistencia.CuotaJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class CuotaDAOImp implements CuotaDAO {

    CuotaJpaController cuotajpa = new CuotaJpaController();
    
    @Override
    public void registrar(Cuota cuota) throws Exception {

cuotajpa.create(cuota);
        
    }

    @Override
    public void actualizar(Cuota cuota) throws Exception {

cuotajpa.edit(cuota);

    }

    @Override
    public void eliminar(int id) throws Exception {

cuotajpa.destroy(id);

    }

    @Override
    public List<Cuota> listar() throws Exception {

return cuotajpa.findCuotaEntities();

    }

    @Override
    public Cuota buscar(int id) throws Exception {

return cuotajpa.findCuota(id);

    }
    
}
