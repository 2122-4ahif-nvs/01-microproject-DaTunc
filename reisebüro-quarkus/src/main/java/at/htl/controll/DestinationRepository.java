package at.htl.controll;

import at.htl.entity.Destination;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
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
