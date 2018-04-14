package org.elsys.ip.repository;

import org.elsys.ip.models.Tank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TankRepository {
    private List<Tank> tankList = new ArrayList<> ();

    public List<Tank> getTankList() {
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