/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.PersonaDAO;
import Modelo.Persona;
import Persistencia.PersonaJpaController;
import java.util.List;

/**
 *
 * @author Britos
 */
public class PersonaDAOImp implements PersonaDAO {
    
    PersonaJpaController personajpa = new PersonaJpaController();

    @Override
    public void registrar(Persona persona) throws Exception {
        personajpa.create(persona);
    }

    @Override
    public void actualizar(Persona persona) throws Exception {
   personajpa.edit(persona);
    }

    @Override
    public void eliminar(int id) throws Exception {
       personajpa.destroy(id);
    }

    @Override
    public List<Persona> listar() throws Exception {
     return personajpa.findPersonaEntities();
    }
    
    @Override
    public Persona buscar (int id) throws Exception{
        return personajpa.findPersona(id);
    }
  
   
}
