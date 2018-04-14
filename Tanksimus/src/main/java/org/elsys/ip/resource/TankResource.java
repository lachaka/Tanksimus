package org.elsys.ip.resource;

import org.elsys.ip.models.Tank;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("/tank")
public class TankResource {

    @GET
    public List<Tank> getTanksList() { return new ArrayList<>(); }

    @GET
    @Path("/tank/{id}")
    public Tank getTankByID() { return null; }

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