/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.ContratoVentaDAO;
import Modelo.ContratoVenta;
import Persistencia.ContratoVentaJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class ContratoVentaDAOImp implements ContratoVentaDAO {

    ContratoVentaJpaController contratoventajpa = new ContratoVentaJpaController();
    @Override
    public void registrar(ContratoVenta contratoventa) throws Exception {

contratoventajpa.create(contratoventa);
        
    }

    @Override
    public void actualizar(ContratoVenta contratoventa) throws Exception {

        contratoventajpa.edit(contratoventa);
        
    }

    @Override
    public void eliminar(int id) throws Exception {

        contratoventajpa.destroy(id);

    }

    @Override
    public List<ContratoVenta> listar() throws Exception {

return contratoventajpa.findContratoVentaEntities();

    }

    @Override
    public ContratoVenta buscar(int id) throws Exception {

       return contratoventajpa.findContratoVenta(id);

    }
    
}
