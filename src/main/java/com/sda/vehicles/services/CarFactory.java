package com.sda.vehicles.services;

import com.sda.vehicles.domain.Car;
import com.sda.vehicles.domain.CarShape;
import com.sda.vehicles.domain.CarTransmission;
import com.sda.vehicles.domain.Vehicle;

public class CarFactory extends VehicleFactory {


    @Override
    public Vehicle buildVehicleInternal(String[] properties) {
        String brand = properties[1];
        String model = properties[2];
        Integer price = Integer.valueOf(properties[3]);
        Integer topSpeed = Integer.valueOf(properties[4]);
        CarTransmission transmission = CarTransmission.valueOf(properties[5]);
        CarShape shape = CarShape.valueOf(properties[6]);

        return new Car(brand, model, price, topSpeed, shape, transmission);
    }



}
