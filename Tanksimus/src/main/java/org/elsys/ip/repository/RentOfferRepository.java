package org.elsys.ip.repository;

import org.elsys.ip.config.HibernateUtil;
import org.elsys.ip.models.RentOffer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class RentOfferRepository {
    public List<RentOffer> getRentOffers() {
        List<RentOffer> rentOffers;

        Session session = HibernateUtil.getSessionFactory().openSession();
        rentOffers = session.createQuery("from RentOffer ", RentOffer.class).list();

        return rentOffers;
    }

    public RentOffer getRentOfferById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.get(RentOffer.class, id);
    }

    public void saveRentOffer(RentOffer rentOffer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save("RentOffer", rentOffer);
        tx.commit();
    }

    public RentOffer updateRentOffer(Integer id, RentOffer rentOffer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        RentOffer persistentRentOffer = getRentOfferById(id);
        session.evict(persistentRentOffer);
        persistentRentOffer.update(rentOffer);
        RentOffer updated = (RentOffer)session.merge(persistentRentOffer);
        tx.commit();
        return updated;
    }

    public void deleteRentOffer(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        RentOffer persistentRentOffer = getRentOfferById(id);
        session.delete(persistentRentOffer);
        tx.commit();
    }

    public List<RentOffer> getRentOffersByName() {
        return null;
    }
}
