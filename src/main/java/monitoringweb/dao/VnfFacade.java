/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringweb.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import monitoringweb.entities.Vnf;

/**
 *
 * @author kvakin
 */
@Stateless
public class VnfFacade extends AbstractFacade<Vnf> {

    @PersistenceContext(unitName = "virtualizationapp_Monitoring-web_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VnfFacade() {
        super(Vnf.class);
    }
    
}
