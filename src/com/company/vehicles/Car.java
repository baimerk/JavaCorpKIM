package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String MarketCar;
    private String ClassCar;
    private double Weight;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("Поехали!");
    };
    public void stop(){
        System.out.println("Останавливаемся!");
    };
    public void turnRight(){
        System.out.println("Поворот Направо!");
    };
    public void turnLeft(){
        System.out.println("Поворот Налево!");
    };

    public Car (){};
    public Car (String marketCar, String classCar, double weight, Driver driver, Engine engine){
        this.MarketCar = marketCar;
        this.ClassCar = classCar;
        this.Weight = weight;
        this.driver = driver;
        this.engine = engine;
    };

    public void printInfo(){
        System.out.printf("Автомобиль марки: %s,\nВодитель: %s,\nДвигатель: %s",this.MarketCar,this.driver.getFullName(),this.engine.getProduction());
    }
}
