package org.acme.controll;

import org.acme.entity.Guide;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class GuideRepository {
    @Inject
    EntityManager em;

    @Transactional
    public Guide save(Guide guide){
        return em.merge(guide);
    }

}
