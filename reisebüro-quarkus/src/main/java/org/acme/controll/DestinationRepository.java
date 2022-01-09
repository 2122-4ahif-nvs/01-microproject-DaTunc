package org.acme.controll;

import org.acme.entity.Destination;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Transient;
import javax.transaction.Transactional;

@ApplicationScoped
public class DestinationRepository {
    @Inject
    EntityManager em;

    @Transactional
    public Destination save(Destination destination){
        return em.merge(destination);
    }

}
