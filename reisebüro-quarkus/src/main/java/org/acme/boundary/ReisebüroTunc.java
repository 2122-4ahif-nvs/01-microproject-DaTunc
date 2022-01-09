package org.acme.boundary;

import org.acme.controll.OfficeRepository;
import org.acme.entity.Office;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/ReisebüroTunc")
public class ReisebüroTunc {

    @Inject
    OfficeRepository or;

    @Path("/")
    @GET
    @Produces("application/json")
    public List<Office> getAllOffices(){
        return or.getAllOffices();
    }

}
