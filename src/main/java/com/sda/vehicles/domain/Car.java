package com.sda.vehicles.domain;

public class Car extends VehicleWithTopSpeed {

    private CarShape shape;
    private CarTransmission transmission;


    public Car(String brand, String model, Integer price, Integer topSpeed, CarShape shape, CarTransmission transmission) {
        super(brand, model, price, topSpeed);
        this.shape = shape;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "shape=" + shape +
                ", transmission=" + transmission +
                '}';
    }
}
