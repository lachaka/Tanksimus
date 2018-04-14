package org.elsys.ip.resource;

import org.elsys.ip.models.Tank;
import org.elsys.ip.service.TankService;

import javax.ws.rs.*;
import java.util.List;

@Path("/tank")
public class TankResource {

    private TankService tankService = new TankService();

    @GET
    public List<Tank> getTanksList() { return tankService.getTanks(); }

    @GET
    @Path("/tank/{id}")
    public Tank getTankByID(@PathParam("id") Integer id) { return tankService.getTankById(id); }

    @POST
    @Path("/tank/add")
    public Tank saveTank() { return null; }

    @PUT
    @Path("/tank/{id}/update")
    public Tank updateTank() { return null; }

    @DELETE
    @Path("/tank/{id}/delete")
    public boolean deleteTank() { return false; }
}