package at.htl.boundary;

import at.htl.controll.GuideRepository;
import at.htl.controll.OfficeRepository;
import at.htl.entity.Office;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/ReisebüroTunc")
public class ReisebüroTunc {

    @Inject
    OfficeRepository or;
    @Inject
    GuideRepository gr;

    @Path("/")
    @GET
    @Produces("application/json")
    public List<Office> getAllOffices(){
        gr.persist(gr.listAll());
        return or.getAllOffices();
    }



}
