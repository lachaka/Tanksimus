package org.elsys.ip.models;

import javax.persistence.*;

@Entity
@Table(name = "tank")
public class Tank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "speed")
    private float speed;

    @Column(name = "length")
    private float length;

    @Column(name = "width")
    private float width;

    @Column(name = "height")
    private float height;

    @Column(name = "weight")
    private float weight;

    @Column(name = "crew")
    private int crew;

    @Column(name = "engine")
    private String engine;

    @Column(name = "country")
    private String country;

    @Column(name = "producer")
    private String producer;

    @Column(name = "type")
    private String type;

    @Column(name = "power")
    private int power;

    public Tank() {
    }

    public Tank(String name, float speed, float length, float width, float height,
                float weight, int crew, String engine, String country,
                String producer, String type, int availability, int power) {
        this.name = name;
        this.speed = speed;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.crew = crew;
        this.engine = engine;
        this.country = country;
        this.producer = producer;
        this.type = type;
        this.power = power;
    }

    public void update(Tank tank) {
        this.name = tank.getName();
        this.speed = tank.getSpeed();
        this.length = tank.getLength();
        this.width = tank.getWidth();
        this.height = tank.getHeight();
        this.weight = tank.getWeight();
        this.crew = tank.getCrew();
        this.engine = tank.getEngine();
        this.country = tank.getCountry();
        this.producer = tank.getProducer();
        this.type = tank.getType();
        this.power = tank.getPower();
    }

    public void rentTank() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSpeed() {
        return speed;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public int getCrew() {
        return crew;
    }
    public void setCrew(int crew) {
        this.crew = crew;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

}
