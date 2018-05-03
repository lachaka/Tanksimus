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

        session.close();
        return tankList;
    }

    public Tank getTankById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Tank tank = session.get(Tank.class, id);
        session.close();
        return tank;
    }

    public void saveTank(Tank tank) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save("Tank", tank);
        tx.commit();
        session.close();
    }

    public Tank updateTank(Integer id, Tank tank) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Tank persistentTank = getTankById(id);
        session.evict(persistentTank);
        persistentTank.update(tank);
        Tank updated = (Tank)session.merge(persistentTank);
        tx.commit();
        session.close();
        return updated;
    }

    public void deleteTank(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Tank persistentTank = getTankById(id);
        session.delete(persistentTank);
        tx.commit();
        session.close();
    }

}