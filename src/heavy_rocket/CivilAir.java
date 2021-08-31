package heavy_rocket;

import java.util.Scanner;

public class CivilAir extends AirMachine{
    private int PassScore; // вообще это поле есть в соседнем классе на уровне родителя чилда
    private boolean Business;
    private int PassCount; // специальная переменная для второго класса, который приват и не вызывается

    public CivilAir(int powerMach, int maxSpeed, int totalMass, String brand, int wingspan, int stringLength, int passScore, boolean business) {
        super(powerMach, maxSpeed, totalMass, brand, wingspan, stringLength);
        this.PassScore = passScore;
        this.Business = business;
    }

    // разработать метод описание, который будет возвращать составленную строку с описанием всех объектов
    public void DescriptionAll() {
        System.out.printf("Info: \n" +
                "Мощность: %f квт,\nМаксимальная скорость: %d км.ч, \nОбщая масса: %d тонн, \nМарка: %s, \n" +
                "Количество колес: %d штук, \nРасход топлива: %s литров в секунду, \nКоличество пассажиров: %d, \nТип класса полета: %s.", this.CountPower(), this.getMaxSpeed(), this.getTotalMass(), this.getBrand(), this.getWingspan(), this.getStringLength(), this.PassScore, this.Business);
    }

    public double CountPower() {
        double power = this.getPowerMach() * 0.74;
        return power;
    }

    // метод подсчета количества пассажиров - публичный
    public void MetodCountPass(){
        System.out.println("В данном методе мы проверим возможность перевозки пассажиров" +
                "\nВведите пожалуйста количество пассажиров для предполагаемой перевозки: ");
        Scanner sc = new Scanner(System.in);
        PassCount = sc.nextInt(); // ввод не забывать использовать тот же тип переменной
        CountPass();
        sc.close();
    }

    // метод самого расчета
    private void CountPass(){
        if (PassCount <= PassScore){
            System.out.println("Самолет вмещает данное количество пассажиров");
        } else {
            System.out.println("Вам нужен самолет побольше или необходимо уменьшить количество пассажиров.");
        }
    }

}
