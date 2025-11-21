package com.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tourist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String city;
    private String touristPackage;
    private Double budget;

    public Tourist() {
        super();
    }

    public Tourist(Integer id, String name, String city, String touristPackage, Double budget) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.touristPackage = touristPackage;
        this.budget = budget;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getTouristPackage() {
        return touristPackage;
    }

    public void setTouristPackage(String touristPackage) {
        this.touristPackage = touristPackage;
    }

    @Override
    public String toString() {
        return "Tourist[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", touristPackage='" + touristPackage + '\'' +
                ", budget=" + budget +
                ']';
    }
}
