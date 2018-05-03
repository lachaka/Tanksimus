package org.elsys.ip.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "rent_offer")
public class RentOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "tank_id")
    private Tank tank;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @Column(name = "upload_time")
    private Time time;

    public RentOffer() {
    }

    public void update(RentOffer rentOffer) {
        this.tank = rentOffer.getTank();
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
    public Tank getTank() {
        return tank;
    }
    public void setTank(Tank tank) {
        this.tank = tank;
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