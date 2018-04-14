package org.elsys.ip.service;

import org.elsys.ip.models.Tank;
import org.elsys.ip.repository.TankRepository;

import java.util.List;

public class TankService {
    public List<Tank> getTanks() { return TankRepository.getTankList(); }
    public Tank getTankById(Integer id) { return TankRepository.getTankById(id); }
    public boolean saveTank(Tank tank) { return TankRepository.saveTank(tank); }
    public Tank updateTank(Integer id, Tank tank) { return TankRepository.updateTank(id, tank); }
    public boolean deleteTank(Integer id) { return TankRepository.deleteTank(id); }
}