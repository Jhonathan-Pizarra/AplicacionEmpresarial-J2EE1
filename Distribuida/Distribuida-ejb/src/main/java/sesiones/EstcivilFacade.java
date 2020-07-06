/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiones;

import entidades.Estcivil;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp
 */
@Stateless
public class EstcivilFacade extends AbstractFacade<Estcivil> implements EstcivilFacadeLocal {

    @PersistenceContext(unitName = "ChidorisU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstcivilFacade() {
        super(Estcivil.class);
    }
    
}
