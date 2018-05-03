package org.elsys.ip.resource;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import org.elsys.ip.models.RentOffer;
import org.elsys.ip.service.RentOfferService;

import javax.ws.rs.*;
import java.util.List;

@Path("rent-offer")
public class RentOfferResource {
    private RentOfferService rentOfferService = new RentOfferService();

    @GET
    @Produces("application/json")
    @JacksonFeatures(serializationEnable = {SerializationFeature.INDENT_OUTPUT})
    public List<RentOffer> getTanksList() {
        return rentOfferService.getRentOffers();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    @JacksonFeatures(serializationEnable = {SerializationFeature.INDENT_OUTPUT})
    public RentOffer getTankByID(@PathParam("id") Integer id) { return rentOfferService.getRentOfferById(id); }

    @POST
    public void saveTank(RentOffer rentOffer) { rentOfferService.saveRentOffer(rentOffer); }

    @PUT
    @Path("/{id}")
    public RentOffer updateTank(@PathParam("id") Integer id, RentOffer rentOffer) { return rentOfferService.updateRentOffer(id, rentOffer); }

    @DELETE
    @Path("/{id}")
    public void deleteTank(@PathParam("id") Integer id) { rentOfferService.deleteRentOffer(id); }
}
