package org.acme.controll;

import org.acme.entity.Office;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class OfficeRepository {

    @Inject
    EntityManager em;

    @Transactional
    public Office save(Office office){
        return em.merge(office);
    }

    public List<Office> getAllOffices() {
        TypedQuery<Office> query = em.createNamedQuery
                ("findAllOffices",Office.class);
        try{
           return query.getResultList();
        }catch (NoResultException ey){
            return null;
        }
    }
}
