package org.elsys.ip.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "rent_offer")
public class RentOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "tank_id")
    private int tankId;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @Column(name = "time")
    private Time time;

    public RentOffer() {
    }

    public void update(RentOffer rentOffer) {
        this.tankId = rentOffer.getTankId();
        this.description = rentOffer.getDescription();
        this.price = rentOffer.getPrice();
        this.time = rentOffer.getTime();
    }

    public int getId() {
        return id;
    }
    public void rent() {}
    public void setId(int id) {
        this.id = id;
    }
    public int getTankId() {
        return tankId;
    }
    public void setTankId(int tankId) {
        this.tankId = tankId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
}