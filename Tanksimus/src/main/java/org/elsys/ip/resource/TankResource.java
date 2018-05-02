package org.elsys.ip.resource;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import org.elsys.ip.models.Tank;
import org.elsys.ip.service.TankService;

import javax.ws.rs.*;
import java.util.List;

@Path("/tank")
public class TankResource {

    private TankService tankService = new TankService();

    @GET
    @Produces("application/json")
    @JacksonFeatures(serializationEnable = {SerializationFeature.INDENT_OUTPUT})
    public List<Tank> getTanksList() { return tankService.getTanks(); }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    @JacksonFeatures(serializationEnable = {SerializationFeature.INDENT_OUTPUT})
    public Tank getTankByID(@PathParam("id") Integer id) { return tankService.getTankById(id); }

    @POST
    @Consumes("application/json")
    public void saveTank(Tank tank) {
        tankService.saveTank(tank); }

    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    @JacksonFeatures(serializationEnable = {SerializationFeature.INDENT_OUTPUT})
    public Tank updateTank(@PathParam("id") Integer id, Tank tank) { return tankService.updateTank(id, tank); }

    @DELETE
    @Path("/{id}")
    public void deleteTank(@PathParam("id") Integer id) { tankService.deleteTank(id); }

    //@POST for /tank/{id}/rent with duration as parameter
}