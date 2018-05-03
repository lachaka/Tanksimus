package org.elsys.ip.repository;

import org.elsys.ip.config.HibernateUtil;
import org.elsys.ip.models.Tank;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class TankRepository {
    public List<Tank> getTankList() {
        List<Tank> tankList;

        Session session = HibernateUtil.getSessionFactory().openSession();
        tankList = session.createQuery("from Tank").list();

        return tankList;
    }

    public Tank getTankById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.get(Tank.class, id);
    }

    public void saveTank(Tank tank) {
        System.out.println(tank.getId() + ", " + tank.getName());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save("Tank", tank);
        tx.commit();
    }

    public Tank updateTank(Integer id, Tank tank) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Tank persistentTank = getTankById(id);
        session.evict(persistentTank);
        persistentTank.update(tank);
        Tank updated = (Tank)session.merge(persistentTank);
        tx.commit();
        return updated;
    }

    public void deleteTank(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Tank persistentTank = getTankById(id);
        session.delete(persistentTank);
        tx.commit();
    }

}