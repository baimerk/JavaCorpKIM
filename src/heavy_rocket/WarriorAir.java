package heavy_rocket;

import java.util.Scanner;

public class WarriorAir extends AirMachine {
    private int RocketSc;
    private boolean SystemBreaks;
    private int StartRocket;


    public WarriorAir(int powerMach, int maxSpeed, int totalMass, String brand, int wingspan, int stringLength, int rocketSc, boolean systemBreaks) {
        super(powerMach, maxSpeed, totalMass, brand, wingspan, stringLength);
        this.RocketSc = rocketSc;
        this.SystemBreaks = systemBreaks;
    }

    public double CountPower() {
        double power = this.getPowerMach() * 0.74;
        return power;
    }

    // разработать метод описание, который будет возвращать составленную строку с описанием всех объектов
    public void DescriptionAll() {
        System.out.printf("Info: \n" +
                "Мощность: %f квт,\nМаксимальная скорость: %d км.ч, \nОбщая масса: %d т, \nМарка: %s, \n" +
                "Размах крыльев: %d,\nДлина взлетно-посадочной полосы: %d m.\n" +
                "Количество ракет: %d, \nНаличие системы катапультирования: %s,", this.CountPower(), this.getMaxSpeed(), this.getTotalMass(), this.getBrand(), this.getWingspan(), this.getStringLength(), this.RocketSc, this.SystemBreaks);
    }

    // делаем метод выстрел, возможно пытаемся стрелять до опустошения боеприпасов
    public void Shoot() {
        System.out.println("В данном методе мы постреляем! Нажмите 1 чтобы выстрелить! Или 0 чтобы катапультироваться!");
        Scanner sc = new Scanner(System.in);
        StartRocket = sc.nextInt();
        if (StartRocket == 1) {
            ShootCounter();
        } else {
            Catapult();
        }
    }

    private void ShootCounter() {
        int Shoot;
        int u = RocketSc;
        for (int i = 0; i < u; i++) {
            Scanner g = new Scanner(System.in);
            System.out.println("Ракета пошла!\n");
            System.out.println("Выпущено: " + (i + 1) + "rocket\n");
            System.out.println("Выстрелить еще? 1/0");
            Shoot = g.nextInt();
            RocketSc--;
            if (Shoot == 1) {
                System.out.println("........");
                if (RocketSc == 0) {
                    System.out.println("Ракеты кончились бро!");
                }
            } else {
                System.out.println("Выхожу из боевой системы");
                break;
            }
            //System.out.println("Ну так то ракеты кончились!");
        }

    }

    private void Catapult() {
        if (SystemBreaks == true) {
            System.out.println("Вы катапультировались!");
        } else {
            System.out.println("Вам пи...а. Катапульты не было в базовой поставке!");
        }

    }

}
