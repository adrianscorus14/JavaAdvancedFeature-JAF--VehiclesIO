package com.sda.vehicles.services;


import com.sda.vehicles.domain.Motorcycle;
import com.sda.vehicles.domain.MotorcycleShape;
import com.sda.vehicles.domain.Vehicle;

public class MotorcycleFactory extends VehicleFactory{
    @Override
    public Vehicle buildVehicleInternal(String[] properties) {
        String brand = properties[1];
        String model = properties[2];
        Integer price = Integer.valueOf(properties[3]);
        Integer topSpeed = Integer.valueOf(properties[4]);
        MotorcycleShape shape = MotorcycleShape.valueOf(properties[5]);

        return new Motorcycle(brand, model, price, topSpeed, shape);
    }
}

