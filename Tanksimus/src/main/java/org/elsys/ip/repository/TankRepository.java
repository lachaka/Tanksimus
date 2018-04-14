package org.elsys.ip.repository;

import org.elsys.ip.models.Tank;

import java.util.ArrayList;
import java.util.List;

public class TankRepository {
    private static List<Tank> tankList = new ArrayList<>();

    public static List<Tank> getTankList() {
        return tankList;
    }

    public static Tank getTankById(Integer id) {
        return tankList.get(id);
    }

    public static boolean saveTank(Tank tank) {
        return tankList.add(tank);
    }

    public static Tank updateTank(Integer id, Tank tank) {
        return tankList.set(id, tank);
    }

    public static boolean deleteTank(Integer id) {
        return tankList.remove(id);
    }

}