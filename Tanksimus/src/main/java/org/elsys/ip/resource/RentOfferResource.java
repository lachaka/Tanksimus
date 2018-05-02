package org.elsys.ip.resource;

import org.elsys.ip.models.RentOffer;
import org.elsys.ip.service.RentOfferService;

import javax.ws.rs.*;
import java.util.List;

@Path("rent_offer")
public class RentOfferResource {
    private RentOfferService rentOfferService = new RentOfferService();

    @GET
    @Produces("application/json")
    public List<RentOffer> getTanksList() { return rentOfferService.getRentOffers(); }

    @GET
    @Path("/rent_offer/{id}")
    public RentOffer getTankByID(@PathParam("id") Integer id) { return rentOfferService.getRentOfferById(id); }

    @POST
    @Path("/rent_offer")
    public boolean saveTank(RentOffer rentOffer) { return rentOfferService.saveRentOffer(rentOffer); }

    @PUT
    @Path("/rent_offer/{id}")
    public RentOffer updateTank(@PathParam("id") Integer id, RentOffer rentOffer) { return rentOfferService.updateRentOffer(id, rentOffer); }

    @DELETE
    @Path("/rent_offer/{id}/delete")
    public boolean deleteTank(@PathParam("id") Integer id) { return rentOfferService.deleteRentOffer(id); }
}
