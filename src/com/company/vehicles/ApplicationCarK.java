package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class ApplicationCarK {
    public static void main(String[] args) {
        Engine engine = new Engine("Mitsubysi",4.5);
        Driver driver = new Driver("Vasilii Petrovich",66);
        Car car = new Car("Mitsu",",Business",3.455,driver, engine);
        car.printInfo();
    }
}
