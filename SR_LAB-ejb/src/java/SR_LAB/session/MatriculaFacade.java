/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SR_LAB.session;

import SR_LAB.entity.Matricula;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sergi
 */
@Stateless
public class MatriculaFacade extends AbstractFacade<Matricula> implements MatriculaFacadeLocal {

    @PersistenceContext(unitName = "SR_LAB-EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MatriculaFacade() {
        super(Matricula.class);
    }
    
}
