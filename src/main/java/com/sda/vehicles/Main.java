package com.sda.vehicles;

import com.sda.vehicles.domain.Car;
import com.sda.vehicles.domain.Vehicle;
import com.sda.vehicles.services.VehicleService;
import com.sda.vehicles.services.VehicleServiceFileImplementation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        VehicleService vService = new VehicleServiceFileImplementation();
        List<Vehicle> vehicles = vService.loadVehicles();
        System.out.println("Vehicles: " + vehicles);

        List<Car> cars = vehicles.stream()
                .filter(v -> v != null && v instanceof Car)
                .map(v -> (Car) v)
                .collect(Collectors.toList());

        System.out.println("Number of cars: " + cars.size());

        List<Car> sortedCars = cars.stream().sorted(new Comparator<Car>() {

            @Override
            public int compare(Car c1, Car c2) {
                return c1.getPrice() - c2.getPrice();
            }
        }).collect(Collectors.toList());
        System.out.println(sortedCars);

    }
}
