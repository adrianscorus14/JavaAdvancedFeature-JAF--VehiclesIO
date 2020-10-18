package com.sda.vehicles.services;

import com.sda.vehicles.domain.Vehicle;

public abstract class VehicleFactory {

    public Vehicle buildVehicle(String[] properties) {
        try {
            return buildVehicleInternal(properties);
        } catch (Exception e) {
            return null;
        }
    }

    protected abstract Vehicle buildVehicleInternal(String[] properties);


}
