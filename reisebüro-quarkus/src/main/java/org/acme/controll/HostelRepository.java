package org.acme.controll;

import org.acme.entity.Hostel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class HostelRepository {
    @Inject
    EntityManager em;

    @Transactional
    public Hostel save(Hostel hostel){
        return em.merge(hostel);
    }
}
