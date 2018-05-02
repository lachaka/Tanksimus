package org.elsys.ip.service;

import org.elsys.ip.models.RentOffer;
import org.elsys.ip.repository.RentOfferRepository;

import java.util.List;

public class RentOfferService {
    private RentOfferRepository rentOfferRepository = new RentOfferRepository();
    public List<RentOffer> getRentOffers() { return rentOfferRepository.getRentOffers(); }
    public RentOffer getRentOfferById(Integer id) { return rentOfferRepository.getRentOfferById(id); }
    public boolean saveRentOffer(RentOffer rentOffer) { return rentOfferRepository.saveRentOffer(rentOffer); }
    public RentOffer updateRentOffer(Integer id, RentOffer rentOffer) { return rentOfferRepository.updateRentOffer(id, rentOffer); }
    public boolean deleteRentOffer(Integer id) { return rentOfferRepository.deleteRentOffer(id); }
}
