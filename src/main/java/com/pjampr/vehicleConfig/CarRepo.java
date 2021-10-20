package com.pjampr.vehicleConfig;

import com.pjampr.vehicleConfig.VehicleInstances.Car;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.CarSubType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.DriveType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.VehicleType;
import com.pjampr.vehicleConfig.VehicleInstances.Vehicle;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CarRepo {

    private ArrayList<Car> cars = new ArrayList<>();

    public CarRepo(){

        cars.add(new Car("GA6548R", "Subaru", "Forester 2.0XT", 2016,"EJ20 H4", "Fuel engine", "Petrol", 1998, 177, VehicleType.CAR, "Automatic", "B", 2, 4, "Silver", false, false, CarSubType.CROSSOVER, false, 5, 5, DriveType.ALL_WHEEL, 387, true, 380));
        cars.add(new Car("GA23552", "Honda", "CR-V", 2018, "RW1, R20A", "Fuel Engine", "Petrol", 1997, 153, VehicleType.CAR, "Automatic", "B", 2, 4, "Red", false, true, CarSubType.SUV, false, 5, 5, DriveType.FOUR_WHEEL, 561, true, 420));
        cars.add(new Car("GD9023W", "Nissan", "e-Note", 2020, "e-Power, electric note", "Electric", "Electric", 0, 107, VehicleType.CAR, "Automatic", "B", 2, 4, "Blue", false, true, CarSubType.HATCHBACK, false, 4, 5, DriveType.FRONT, 295, true, 440));
        cars.add(new Car("GD6784P", "Subaru", "Forester 2.5XT", 2010,"EJ40 H4", "Fuel engine", "Petrol + LPG", 2498, 275, VehicleType.CAR, "Automatic", "B", 2, 4, "Black", false, false, CarSubType.CROSSOVER, false, 5, 5, DriveType.ALL_WHEEL, 387, true, 350));
        cars.add(new Car("GTC4562", "Nissan", "X-Trail", 2020, "X-Trail II, T32, ST", "Fuel engine", "Diesel", 1698, 148, VehicleType.CAR, "Automatic", "B", 2, 4, "Blue", false, true, CarSubType.SUV, false, 5, 5, DriveType.FOUR_WHEEL, 580, true, 780));
    }

    public ArrayList<Car> findByBrand (String brand){
        ArrayList<Car> carsFound = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().toLowerCase().contains(brand.toLowerCase())){
                carsFound.add(car);
            }
        }
        System.out.println("\nCars found: " + carsFound.size());
        return carsFound;
    }

    public ArrayList<Car> findByModel (String model){
        ArrayList<Car> carsFound = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().toLowerCase().contains(model.toLowerCase())){
                carsFound.add(car);
            }
        }
        System.out.println("\nCars found: " + carsFound.size());
        return carsFound;
    }

    public Car findByRegistrationNumber(String registrationNumber){
        for (Car car : cars) {
            if(car.getRegistrationNumber().equals(registrationNumber)){
                return car;
            }

        }
        return null;
    }


}

