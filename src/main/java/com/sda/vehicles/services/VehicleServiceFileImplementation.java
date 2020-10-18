package com.sda.vehicles.services;

import com.sda.vehicles.domain.Vehicle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleServiceFileImplementation implements VehicleService {
    private final static String FILE_NAME = "/vehicles.txt";

    private static Map<String, VehicleFactory> factories = new HashMap<>();

    static {
        factories.put("Car" , new CarFactory());
        factories.put("Motorcycle" , new MotorcycleFactory());
        factories.put("Tractor" , new TractorFactory());
    }

    @Override
    public List<Vehicle> loadVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        BufferedReader reader = null;
        try {
            URL url = this.getClass().getResource(FILE_NAME);
            File file = new File(url.toURI());
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                vehicles.add(convertLineToVehicle(line));
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return vehicles;

    }

    private Vehicle convertLineToVehicle(String line) {
        String[] properties = line.split(", ");
        if (factories.containsKey(properties[0])) {
            Vehicle vehicle = factories.get(properties[0]).buildVehicle(properties);
            return vehicle;
        }
        else return null;
    }
}
