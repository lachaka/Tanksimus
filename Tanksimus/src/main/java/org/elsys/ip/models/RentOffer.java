package org.elsys.ip.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rent_offer")
public class RentOffer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "tank_id")
    private int tankId;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @Column(name = "time")
    private Date time;

    @Column(name = "user_id")
    private int userId;

    public RentOffer() {
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}