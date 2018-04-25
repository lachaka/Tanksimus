package org.elsys.ip.repository;

import org.elsys.ip.config.HibernateUtil;
import org.elsys.ip.models.Tank;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class TankRepository {
    private List<Tank> tankList = new ArrayList<> ();

    public List<Tank> getTankList() {
        List<Tank> tankList;

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        tankList = session.createQuery("from Tank").list();

        return tankList;
    }

    public Tank getTankById(Integer id) {
        return tankList.get(id);
    }

    public boolean saveTank(Tank tank) {
        return tankList.add(tank);
    }

    public Tank updateTank(Integer id, Tank tank) {
        return tankList.set(id, tank);
    }

    public boolean deleteTank(Integer id) {
        return tankList.remove(id);
    }

}