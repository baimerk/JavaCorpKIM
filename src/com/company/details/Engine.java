package com.company.details;

public class Engine {
    private double Power;
    private String Production;

    public Engine(String production, double power){
        this.Production = production;
        this.Power = power;
    }

    public double getPower() {
        return Power;
    }

    public String getProduction() {
        return Production;
    }

    public void setPower(double power) {
        Power = power;
    }

    public void setProduction(String production) {
        Production = production;
    }
}
