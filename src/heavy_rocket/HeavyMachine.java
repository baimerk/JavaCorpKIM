package heavy_rocket;

import java.util.Scanner;

public class HeavyMachine extends DownMachine {
    private int Carrying;
    private double MassaCargo; // переменная мне необходима для избежания проблем с инициализацией и использованием переменных
    // вне публичного класса, конкретно в приватном классе

    public HeavyMachine(int powerMach, int maxSpeed, int totalMass, String brand, int numbWhile, int oilResourse, int carrying) {
        super(powerMach, maxSpeed, totalMass, brand, numbWhile, oilResourse);
        this.Carrying = carrying;
    }

    // разработать метод описание, который будет возвращать составленную строку с описанием всех объектов
    public void DescriptionAll() {
        System.out.printf("Info: \n" +
                "Мощность: %f квт,\nМаксимальная скорость: %d км.ч, \nОбщая масса: %d тонн, \nМарка: %s, \n" +
                "Количество колес: %d штук, \nРасход топлива: %s литров в секунду, \nГрузоподъемность: %d тонн.", this.CountPower(), this.getMaxSpeed(), this.getTotalMass(), this.getBrand(), this.getNumbWhile(), this.getOilResourse(), this.Carrying);
    }

    public double CountPower() {
        double power = this.getPowerMach() * 0.74;
        return power;
    }

    // метод проверки загрузки груза

    public void CargoCount(){
        System.out.println("В данном методе мы проверим возможность перевозки Вашего груза" +
                "\nВведите пожалуйста вес вашего предполагаемого к перевозке груза: ");
        Scanner sc = new Scanner(System.in);
        MassaCargo = sc.nextDouble(); // ввод не забывать использовать тот же тип переменной

        MetodCargoCoint();
        sc.close();
    }

    // сам расчет и условие, закрытый метод

    private void MetodCargoCoint (){
        if (MassaCargo <= Carrying){
            System.out.println("Ваш грузовик способен перевезти данный груз");
        } else {
            System.out.println("Вам нужен грузовик побольше!");
        }
    }

}
