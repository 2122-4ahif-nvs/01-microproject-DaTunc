package org.acme.controll;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.entity.Guide;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class GuideRepository implements PanacheRepository<Guide> {


}
