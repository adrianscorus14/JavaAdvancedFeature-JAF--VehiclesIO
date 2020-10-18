package com.sda.vehicles.domain;

public class Tractor extends Vehicle {

    private Integer maxPulledWeight;

    public Tractor(String brand, String model, Integer price, Integer maxPulledWeight) {
        super(brand, model, price);
        this.maxPulledWeight = maxPulledWeight;
    }
}
