/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.CronogramaPagosDAO;
import Modelo.CronogramaPagos;
import Persistencia.CronogramaPagosJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class CronogramaPagosDAOImp implements CronogramaPagosDAO{

    CronogramaPagosJpaController cronogramapagosjpa= new CronogramaPagosJpaController(); 
    
    @Override
    public void registrar(CronogramaPagos cronogramapagos) throws Exception {

cronogramapagosjpa.create(cronogramapagos);
        
    }

    @Override
    public void actualizar(CronogramaPagos cronogramapagos) throws Exception {

cronogramapagosjpa.edit(cronogramapagos);
        
    }

    @Override
    public void eliminar(int id) throws Exception {

cronogramapagosjpa.destroy(id);

    }

    @Override
    public List<CronogramaPagos> listar() throws Exception {
      
        return cronogramapagosjpa.findCronogramaPagosEntities();
        
    }

    @Override
    public CronogramaPagos buscar(int id) throws Exception {

return cronogramapagosjpa.findCronogramaPagos(id);

    }
    
}
