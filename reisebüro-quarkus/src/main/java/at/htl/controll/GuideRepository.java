package at.htl.controll;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import at.htl.entity.Guide;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GuideRepository implements PanacheRepository<Guide> {


}
