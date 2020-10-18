package com.sda.vehicles.services;

import com.sda.vehicles.domain.Tractor;
import com.sda.vehicles.domain.Vehicle;

public class TractorFactory extends VehicleFactory {
    @Override
    public Vehicle buildVehicleInternal(String[] properties) {
        String brand = properties[1];
        String model = properties[2];
        Integer price = Integer.valueOf(properties[3]);
        Integer maxPulledWeight = Integer.valueOf(properties[4]);


        return new Tractor(brand, model, price, maxPulledWeight);
    }

}
