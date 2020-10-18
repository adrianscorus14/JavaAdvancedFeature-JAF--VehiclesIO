package com.sda.vehicles.domain;

public abstract class Vehicle {

    private String brand;
    private String model;
    private Integer price;


    public Vehicle(String brand, String model, Integer price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
