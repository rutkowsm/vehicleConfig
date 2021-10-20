package com.pjampr.vehicleConfig.VehicleInstances;

import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.CarSubType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.DriveType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.VehicleType;

public class Lorry extends Car{

    protected int packingCapacity;

    public Lorry(String registrationNumber, String brand, String model, int yearOfProduction, String additionalName, String engineType, String fuelType, int engineCapacity, int horsePower, VehicleType vehicleType, String gearType, String driversLicenceRequired, int yearsOfLicenceRequired, int wheels, String colour, boolean hasInsurance, boolean hasNavigation, CarSubType carSubType, boolean hasSpareWheel, int numSeats, int numDoors, DriveType driveType, int trunkCapacityLitres, boolean isAvailable, int basePrice, int packingCapacity) {
        super(registrationNumber, brand, model, yearOfProduction, additionalName, engineType, fuelType, engineCapacity, horsePower, vehicleType, gearType, driversLicenceRequired, yearsOfLicenceRequired, wheels, colour, hasInsurance, hasNavigation, carSubType, hasSpareWheel, numSeats, numDoors, driveType, trunkCapacityLitres, isAvailable, basePrice);
        this.packingCapacity = packingCapacity;
    }

    public Lorry(String registrationNumber, String brand, String model, int yearOfProduction, String additionalName, String engineType, String fuelType, int engineCapacity, int horsePower, VehicleType vehicleType, String gearType, String driversLicenceRequired, int yearsOfLicenceRequired, int wheels, String colour, boolean hasInsurance, boolean hasNavigation, boolean isAvailable, int basePrice, CarSubType carSubType, boolean hasSpareWheel, int numSeats, int numDoors, DriveType driveType, int trunkCapacityLitres, int packingCapacity) {
        super(registrationNumber, brand, model, yearOfProduction, additionalName, engineType, fuelType, engineCapacity, horsePower, vehicleType, gearType, driversLicenceRequired, yearsOfLicenceRequired, wheels, colour, hasInsurance, hasNavigation, isAvailable, basePrice, carSubType, hasSpareWheel, numSeats, numDoors, driveType, trunkCapacityLitres);
        this.packingCapacity = packingCapacity;
    }

    public int getPackingCapacity() {
        return packingCapacity;
    }

    public void setPackingCapacity(int packingCapacity) {
        this.packingCapacity = packingCapacity;
    }
}
