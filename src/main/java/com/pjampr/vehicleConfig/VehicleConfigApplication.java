package com.pjampr.vehicleConfig;

import com.pjampr.vehicleConfig.VehicleInstances.Car;
import com.pjampr.vehicleConfig.CarRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class VehicleConfigApplication {

    private CarRepo carRepo = new CarRepo();
    Scanner scanner = new Scanner(System.in);


    public void searchByBrand(String brand){
        System.out.printf("\tSearching for the following brand: %s", brand);
        ArrayList<Car> cars = carRepo.findByBrand(brand);

        for (Car car : cars) {
            System.out.println("-----------------");
            System.out.printf("\tRegistration number: %s\n\tBrand: %s\n\tModel: %s\n\tYear of production: %s\n\t", car.getRegistrationNumber(), car.getBrand(), car.getModel(), car.getYearOfProduction());
            System.out.printf("\n\tAvaliability: %s\n\tBasePrice: %s PLN per day\n", (car.getIsAvailable() ? "Available" : "Not Available"), car.getBasePrice());
        }


    }

    public void searchByModel(String model){
        System.out.printf("\tSearching for the following brand: %s", model);
        ArrayList<Car> cars = carRepo.findByModel(model);

        for (Car car : cars) {
            System.out.println("-----------------");
            System.out.printf("\tRegistration number: %s\n\tBrand: %s\n\tModel: %s\n\tYear of production: %s\n\t", car.getRegistrationNumber(), car.getBrand(), car.getModel(), car.getYearOfProduction());
            System.out.printf("\n\tAvaliability: %s\n\tBasePrice: %s PLN per day\n", (car.getIsAvailable() ? "Available" : "Not Available"), car.getBasePrice());
        }


    }

    public void searchByRegistrationNumber(String registrationNumber){
        System.out.printf("\tSearching for the following registration number: %s", registrationNumber);
        Car car = carRepo.findByRegistrationNumber(registrationNumber);
        if (car != null) {
            System.out.printf("\tRegistration number: %s\n\tBrand: %s\n\tModel: %s\n\tYear of production: %s\n\t", car.getRegistrationNumber(), car.getBrand(), car.getModel(), car.getYearOfProduction());
            System.out.printf("\n\tAvaliability: %s\n\tBasePrice: %s PLN per day\n", (car.getIsAvailable() ? "Available" : "Not Available"), car.getBasePrice());
        }
        else {
            System.out.println("No such registration number exists in our records.");
        }
    }

    public void rentCar(String registrationNumber){

        Car car = carRepo.findByRegistrationNumber(registrationNumber);
        if (car != null) {
            if (car.rentCar() == true) {
                System.out.println("Vehicle has been rented successfully!");
                System.out.printf("\tRegistration number: %s\n\tBrand: %s\n\tModel: %s\n\tYear of production: %s\n\t", car.getRegistrationNumber(), car.getBrand(), car.getModel(), car.getYearOfProduction());
                System.out.printf("\n\tAvaliability: %s\n\tBasePrice: %s PLN per day\n", (car.getIsAvailable() ? "Available" : "Not Available"), car.getBasePrice());
            }
            else {
                System.out.println("Vehicle is currently unavailable.");
                System.out.println("-------------------------------------");
            }
        }
        else {
            System.out.println("Failed to return vehicle!");
            System.out.printf("Reason: cannot identify this registration number: %s in the record", registrationNumber);
        }
    }

    public void returnCar(String registrationNumber){

        Car car = carRepo.findByRegistrationNumber(registrationNumber);
        if (car != null) {
            if (car.returnCar() == true) {
                System.out.println("Vehicle has been returned successfully!");
                System.out.printf("\tRegistration number: %s\n\tBrand: %s\n\tModel: %s\n\tYear of production: %s\n\t", car.getRegistrationNumber(), car.getBrand(), car.getModel(), car.getYearOfProduction());
                System.out.printf("\n\tAvaliability: %s\n\tBasePrice: %s PLN per day\n", (car.getIsAvailable() ? "Available" : "Not Available"), car.getBasePrice());
            }
            else {
                System.out.println("Vehicle has not been rented and therefore cannot be returned.");
                System.out.println("-------------------------------------");
            }
        }
        else {
            System.out.println("Failed to return vehicle!");
            System.out.printf("Reason: cannot identify this registration number: %s in the record", registrationNumber);
        }

    }






}

