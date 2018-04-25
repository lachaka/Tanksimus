package org.elsys.ip.resource;

import org.elsys.ip.models.Tank;
import org.elsys.ip.service.TankService;

import javax.ws.rs.*;
import java.util.List;

@Path("/tank")
public class TankResource {

    private TankService tankService = new TankService();

    @GET
    @Produces("application/json")
    public List<Tank> getTanksList() { return tankService.getTanks(); }

    @GET
    @Path("/tank/{id}")
    public Tank getTankByID(@PathParam("id") Integer id) { return tankService.getTankById(id); }

    @POST
    @Path("/tank/add")
    public boolean saveTank(Tank tank) { return tankService.saveTank(tank); }

    @PUT
    @Path("/tank/{id}/update")
    public Tank updateTank(@PathParam("id") Integer id, Tank tank) { return tankService.updateTank(id, tank); }

    @DELETE
    @Path("/tank/{id}/delete")
    public boolean deleteTank(@PathParam("id") Integer id) { return tankService.deleteTank(id); }

    //@POST for /tank/{id}/rent with duration as parameter
}