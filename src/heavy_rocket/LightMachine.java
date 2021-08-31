package heavy_rocket;

import java.util.Scanner;

public class LightMachine extends DownMachine {
    private String TypeCover;
    private int ScorePass;

    public LightMachine(int powerMach, int maxSpeed, int totalMass, String brand, int numbWhile, int oilResourse, String typeCover, int scorePass) {
        super(powerMach, maxSpeed, totalMass, brand, numbWhile, oilResourse);
        this.TypeCover = typeCover; // тип кузова
        this.ScorePass = scorePass; // количество пассажиров
    }

    // разработать метод описание, который будет возвращать составленную строку с описанием всех объектов
    public void DescriptionAll() {
        System.out.printf("Info: \n" +
                "Мощность: %f квт,\nМаксимальная скорость: %d км.ч, \nОбщая масса: %d тонн, \nМарка: %s,\n" +
                "Количество колес: %d штук, \nРасход топлива: %s литров в секунду, \nТип кузова: %s, \nКоличество пассажиров: %d.", this.CountPower(), this.getMaxSpeed(), this.getTotalMass(), this.getBrand(), this.getNumbWhile(), this.getOilResourse(), this.TypeCover, this.ScorePass);
    }

    public double CountPower() {
        double power = this.getPowerMach() * 0.74;
        return power;
    }

    // метод для расчета расстояния, которое проедет транспорт за устанавливаемое время, принимая во внимание скорость
    // которая остается максимальной и количество топлива (необходимо также рассчитать)
    public void CounterLight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести время в часах для расчета расстояния и расхода");
        double t = sc.nextDouble(); // ввести время в часах
        System.out.println("Время в часах: " + t + " ч.");
        double R; // расстояние, которое проедет автомобиль.
        R = t * getMaxSpeed();
        double Y; // количество израсходованного топлива на 1 км
        Y = R * (getOilResourse()*0.01);

        System.out.printf("За время %f ч., автомобиль марки %s,\nдвигаясь с максимальной скоростью %d км/ч проедет %f км и израсходует %f л. топлива", t, getBrand(), getMaxSpeed(), R, Y);
        sc.close();
    }

}
