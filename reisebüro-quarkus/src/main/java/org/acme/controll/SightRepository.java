package org.acme.controll;

import org.acme.entity.Sight;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class SightRepository {
    @Inject
    EntityManager em;

    @Transactional
    public Sight save (Sight sight){
        return em.merge(sight);
    }

}
