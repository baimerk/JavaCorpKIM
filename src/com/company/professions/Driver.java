package com.company.professions;

public class Driver {
    private String fullName;
    private double driverAge; // стаж вождения

    public Driver(String fullName, double driverAge){
        this.fullName = fullName;
        this.driverAge = driverAge;
    }

    public String getFullName() {
        return fullName;
    }

    public double getDriverAge() {
        return driverAge;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDriverAge(double driverAge) {
        this.driverAge = driverAge;
    }
}
