package com.pjampr.vehicleConfig.VehicleInstances;

import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.CarSubType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.DriveType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.VehicleType;

public class Car extends Vehicle {

    protected CarSubType carSubType;    //SUV, LIMO, LORRY, etc...
    protected boolean hasSpareWheel;
    protected int numSeats;             //How many people can it carry?
    protected int numDoors;             //Quantity of door including trunk (typically 3, 4 or 5)
    protected DriveType driveType;         //front, back, 4x4, AWD, etc.
    private int trunkCapacityLitres;

    public Car(String registrationNumber, String brand, String model, int yearOfProduction, String additionalName, String engineType, String fuelType, int engineCapacity, int horsePower, VehicleType vehicleType, String gearType, String driversLicenceRequired, int yearsOfLicenceRequired, int wheels, String colour, boolean hasInsurance, boolean hasNavigation, CarSubType carSubType, boolean hasSpareWheel, int numSeats, int numDoors, DriveType driveType, int trunkCapacityLitres, boolean isAvailable, int basePrice) {
        super(registrationNumber, brand, model, yearOfProduction, additionalName, engineType, fuelType, engineCapacity, horsePower, vehicleType, gearType, driversLicenceRequired, yearsOfLicenceRequired, wheels, colour, hasInsurance, hasNavigation, isAvailable, basePrice);
        this.carSubType = carSubType;
        this.hasSpareWheel = hasSpareWheel;
        this.numSeats = numSeats;
        this.numDoors = numDoors;
        this.driveType = driveType;
        this.trunkCapacityLitres = trunkCapacityLitres;
    }

    public Car(String registrationNumber, String brand, String model, int yearOfProduction, String additionalName, String engineType, String fuelType, int engineCapacity, int horsePower, VehicleType vehicleType, String gearType, String driversLicenceRequired, int yearsOfLicenceRequired, int wheels, String colour, boolean hasInsurance, boolean hasNavigation, boolean isAvailable, int basePrice, CarSubType carSubType, boolean hasSpareWheel, int numSeats, int numDoors, DriveType driveType, int trunkCapacityLitres) {
        super(registrationNumber, brand, model, yearOfProduction, additionalName, engineType, fuelType, engineCapacity, horsePower, vehicleType, gearType, driversLicenceRequired, yearsOfLicenceRequired, wheels, colour, hasInsurance, hasNavigation, isAvailable, basePrice);
        this.carSubType = carSubType;
        this.hasSpareWheel = hasSpareWheel;
        this.numSeats = numSeats;
        this.numDoors = numDoors;
        this.driveType = driveType;
        this.trunkCapacityLitres = trunkCapacityLitres;
    }

    public CarSubType getCarSubType() {
        return carSubType;
    }

    public void setCarSubType(CarSubType carSubType) {
        this.carSubType = carSubType;
    }

    public boolean isHasSpareWheel() {
        return hasSpareWheel;
    }

    public void setHasSpareWheel(boolean hasSpareWheel) {
        this.hasSpareWheel = hasSpareWheel;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }

    public boolean rentCar(){
        if (isAvailable){
            setIsAvailable(false);
            return true;
        }
        return false;

    }

    public boolean returnCar(){
        if (!isAvailable){
            setIsAvailable(true);
            return true;
        }
        return false;
    }


}
