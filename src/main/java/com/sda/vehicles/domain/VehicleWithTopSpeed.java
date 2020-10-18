package com.sda.vehicles.domain;

public class VehicleWithTopSpeed extends Vehicle{

    private Integer topSpeed;

    public VehicleWithTopSpeed(String brand, String model, Integer price, Integer topSpeed) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
    }
}

