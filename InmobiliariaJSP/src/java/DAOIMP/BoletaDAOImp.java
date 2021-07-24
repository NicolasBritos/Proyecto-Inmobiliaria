/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.BoletaDAO;
import Modelo.Boleta;
import Persistencia.BoletaJpaController;

import java.util.List;

/**
 *
 * @author Britos
 */
public class BoletaDAOImp implements BoletaDAO {
     BoletaJpaController boletajpa = new BoletaJpaController();

    @Override
    public void registrar(Boleta boleta) throws Exception {
       boletajpa.create(boleta);
    }

    @Override
    public void actualizar(Boleta boleta) throws Exception {
      boletajpa.edit(boleta);
    }

    @Override
    public void eliminar(int id) throws Exception {
   boletajpa.destroy(id);
        }

    @Override
    public List<Boleta> listar() throws Exception {
   return boletajpa.findBoletaEntities();
    }

    @Override
    public Boleta buscar(int id) throws Exception {
  return boletajpa.findBoleta(id);
    }
    

}
