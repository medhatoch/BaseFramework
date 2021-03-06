/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.baseframework.service;

import com.webapp.baseframework.bean.Input;
import com.webapp.baseframework.bean.ProvidedInterfaceItem;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Soufiane
 */
@Stateless
public class InputFacade extends AbstractFacade<Input> {

    @PersistenceContext(unitName = "com.webapp_BaseFramework_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public List<Input> findInputByPitm(ProvidedInterfaceItem pitm) {
        String query = "SELECT i FROM Input i WHERE i.providedInterfaceItem.id="+pitm.getId();
        return em.createQuery(query).getResultList();
    }

    public InputFacade() {
        super(Input.class);
    }

}
