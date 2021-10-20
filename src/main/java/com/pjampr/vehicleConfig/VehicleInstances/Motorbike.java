package com.pjampr.vehicleConfig.VehicleInstances;

import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.BikeSubtype;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.VehicleType;

public class Motorbike extends Vehicle{

    protected BikeSubtype bikeSubType;
    protected String tyreType;
    protected boolean hasPassengerSeat;
    protected boolean hasProtectionFrame;
    protected boolean hasCentralTrunk;
    protected boolean hasSideTrunks;


    public Motorbike(String registrationNumber, String brand, String model, int yearOfProduction, String additionalName, String engineType, String fuelType, int engineCapacity, int horsePower, VehicleType vehicleType, String gearType, String driversLicenceRequired, int yearsOfLicenceRequired, int wheels, String colour, boolean hasInsurance, boolean hasNavigation, boolean isAvailable, int basePrice, BikeSubtype bikeSubType, String tyreType, boolean hasPassengerSeat, boolean hasProtectionFrame, boolean hasCentralTrunk, boolean hasSideTrunks) {
        super(registrationNumber, brand, model, yearOfProduction, additionalName, engineType, fuelType, engineCapacity, horsePower, vehicleType, gearType, driversLicenceRequired, yearsOfLicenceRequired, wheels, colour, hasInsurance, hasNavigation, isAvailable, basePrice);
        this.bikeSubType = bikeSubType;
        this.tyreType = tyreType;
        this.hasPassengerSeat = hasPassengerSeat;
        this.hasProtectionFrame = hasProtectionFrame;
        this.hasCentralTrunk = hasCentralTrunk;
        this.hasSideTrunks = hasSideTrunks;
    }

    public BikeSubtype getBikeSubType() {
        return bikeSubType;
    }

    public void setBikeSubType(BikeSubtype bikeSubType) {
        this.bikeSubType = bikeSubType;
    }

    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    public boolean isHasPassengerSeat() {
        return hasPassengerSeat;
    }

    public void setHasPassengerSeat(boolean hasPassengerSeat) {
        this.hasPassengerSeat = hasPassengerSeat;
    }

    public boolean isHasProtectionFrame() {
        return hasProtectionFrame;
    }

    public void setHasProtectionFrame(boolean hasProtectionFrame) {
        this.hasProtectionFrame = hasProtectionFrame;
    }

    public boolean isHasCentralTrunk() {
        return hasCentralTrunk;
    }

    public void setHasCentralTrunk(boolean hasCentralTrunk) {
        this.hasCentralTrunk = hasCentralTrunk;
    }

    public boolean isHasSideTrunks() {
        return hasSideTrunks;
    }

    public void setHasSideTrunks(boolean hasSideTrunks) {
        this.hasSideTrunks = hasSideTrunks;
    }
}
