package org.elsys.ip.models;

import javax.persistence.*;

@Entity
@Table(name = "tank")
public class Tank {
    @Id
    @GeneratedValue
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

    @Column(name = "engine_id")
    private int engineId;

    @Column(name = "country_id")
    private int countryId;

    @Column(name = "producer_id")
    private int producer_id;

    @Column(name = "type_id")
    private int typeId;

    @Column(name = "availability")
    private int availability;

    public Tank() {
    }

    public Tank(String name, float speed, float length, float width, float height, float weight, int crew, int engineId, int countryId, int producer_id, int typeId, int availability) {
        this.name = name;
        this.speed = speed;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.crew = crew;
        this.engineId = engineId;
        this.countryId = countryId;
        this.producer_id = producer_id;
        this.typeId = typeId;
        this.availability = availability;
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

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getProducer_id() {
        return producer_id;
    }

    public void setProducer_id(int producer_id) {
        this.producer_id = producer_id;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}
