package com.pjampr.vehicleConfig.VehicleInstances;

import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.VehicleType;

public class Vehicle {

    protected String registrationNumber;
    protected String brand;                 //brand of a vehicle manually set (e.g. Honda)
    protected String model;                 //model - manually set (e.g. NTV650 Revere)
    protected int yearOfProduction;         //
    protected String additionalName;        //additional info like optional model name, popular nickname of a model, (e.g. RC33)
    protected String engineType;            //fuelEngine, hybrid, electric
    protected String fuelType;              //petrol, diesel, LPG, electric, etc
    protected int engineCapacity;           //Engine capacity in cm3 (e.g. 1998cm3 = 2.0 l)
    protected int horsePower;               //Horse power of the engine (e.g. 115hp)
    protected VehicleType vehicleType;      //Car, Lorry or a bike?
    protected String gearType;              //Manual, automatic, semi-automatic, etc...
    protected String driversLicenceRequired; //What licence is required to rent this particular vehicle
    protected int yearsOfLicenceRequired;   //Number of years required of active driving to rent particular vehicle
    protected int wheels;                   //usually 4 for cars, 2 for motorbikes

    protected String colour;
    protected boolean hasInsurance;         //Was additional insurance purchased?
    protected boolean hasNavigation;        //Extra accesories added?
    protected boolean isAvailable;          //Can this vehicle be rented at the moment?
    protected int basePrice;                //price at starting point


    public Vehicle(String registrationNumber, String brand, String model, int yearOfProduction, String additionalName, String engineType, String fuelType, int engineCapacity, int horsePower, VehicleType vehicleType, String gearType, String driversLicenceRequired, int yearsOfLicenceRequired, int wheels, String colour, boolean hasInsurance, boolean hasNavigation, boolean isAvailable, int basePrice) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.additionalName = additionalName;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.vehicleType = vehicleType;
        this.gearType = gearType;
        this.driversLicenceRequired = driversLicenceRequired;
        this.yearsOfLicenceRequired = yearsOfLicenceRequired;
        this.wheels = wheels;
        this.colour = colour;
        this.hasInsurance = hasInsurance;
        this.hasNavigation = hasNavigation;
        this.isAvailable = isAvailable;
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getDriversLicenceRequired() {
        return driversLicenceRequired;
    }

    public void setDriversLicenceRequired(String driversLicenceRequired) {
        this.driversLicenceRequired = driversLicenceRequired;
    }

    public int getYearsOfLicenceRequired() {
        return yearsOfLicenceRequired;
    }

    public void setYearsOfLicenceRequired(int yearsOfLicenceRequired) {
        this.yearsOfLicenceRequired = yearsOfLicenceRequired;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean getHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public boolean getHasNavigation() {
        return hasNavigation;
    }

    public void setHasNavigation(boolean hasNavigation) {
        this.hasNavigation = hasNavigation;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
