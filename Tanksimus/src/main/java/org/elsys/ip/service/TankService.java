package org.elsys.ip.service;

import org.elsys.ip.models.Tank;
import org.elsys.ip.repository.TankRepository;

import java.util.List;

public class TankService {
    private TankRepository tankRepository = new TankRepository();
    public List<Tank> getTanks() { return tankRepository.getTankList(); }
    public Tank getTankById(Integer id) { return tankRepository.getTankById(id); }
    public void saveTank(Tank tank) { tankRepository.saveTank(tank); }
    public Tank updateTank(Integer id, Tank tank) { return tankRepository.updateTank(id, tank); }
    public void deleteTank(Integer id) { tankRepository.deleteTank(id); }
}