package com.theironyard;

public class VehicleInfo {

    int VIN;
    double odometer;
    double consumptions;
    double milesSinceOil;
    double enginSize;

    public VehicleInfo() {
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getConsumptions() {
        return consumptions;
    }

    public void setConsumptions(double consumptions) {
        this.consumptions = consumptions;
    }

    public double getMilesSinceOil() {
        return milesSinceOil;
    }

    public void setMilesSinceOil(double milesSinceOil) {
        this.milesSinceOil = milesSinceOil;
    }

    public double getEnginSize() {
        return enginSize;
    }

    public void setEnginSize(double enginSize) {
        this.enginSize = enginSize;
    }
}
