package com.sda.vehicles.domain;

public class Motorcycle extends VehicleWithTopSpeed {

    private MotorcycleShape shape;

    public Motorcycle(String brand, String model, Integer price, Integer topSpeed, MotorcycleShape shape) {
        super(brand, model, price, topSpeed);
        this.shape = shape;
    }


}
