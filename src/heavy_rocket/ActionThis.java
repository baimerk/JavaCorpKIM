package heavy_rocket;

import java.util.Scanner;

public class ActionThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WarriorAir warriorAir = new WarriorAir(500, 220, 60, "KAMAZ", 100, 10000, 3, true);
        HeavyMachine heavyMachine = new HeavyMachine(513, 350, 20, "tesla", 4, 20, 150);
        LightMachine lightMachine = new LightMachine(516, 220, 80, "JMS", 6, 10, "Спец.покрытие", 50);
        CivilAir civilAir = new CivilAir(130, 230, 30, "Ford", 422, 800, 422, true);
        System.out.println("Вы хотите вывести информацию: \n1.Легкий транспорт; \n2.Грузовой транспорт; \n3.Военный транспорт; \n4.Гражданский транспорт");
        int rand = sc.nextInt();
            if (rand == 1) {
                lightMachine.DescriptionAll();
                System.out.println();
                System.out.println("Вы желаете рассчитать расстояние, " +
                        "которое проедет легкий транспорт и максимальный " +
                        "расход топлива? 1/0");

                int answer = sc.nextInt();
                if (answer == 1) {
                    lightMachine.CounterLight();
                } else {
                    System.out.println("Всего Вам хорошего!");
                }
            } else {
                if (rand == 2) {
                    heavyMachine.DescriptionAll();
                    System.out.println();
                    System.out.println(":Желаете проверить грузоподъемность вашего транспорта? 1/0 ответ");

                    int answer = sc.nextInt();
                    if (answer == 1) {
                        heavyMachine.CargoCount();
                    } else {
                        System.out.println("Всего Вам хорошего!");
                    }
                } else {
                    if (rand == 3) {
                        warriorAir.DescriptionAll();
                        System.out.println();
                        warriorAir.Shoot();
                    } else {
                        if (rand == 4) {
                            civilAir.DescriptionAll();
                            System.out.println();
                            System.out.println(":Желаете проверить вместимость вашего самолета? 1/0 ответ");

                            int answer = sc.nextInt();
                            if (answer == 1) {
                                civilAir.MetodCountPass();
                            } else {
                                System.out.println("Всего Вам хорошего!");
                            }
                        } else {
                            System.out.println("Вы ввели неверный тип!");
                        }
                    }
                }
            }
        System.out.println();

        // abstract - абстрактный класс - нельзя создать экземпляр такого класса, методы и поля можно использовать, однако сам класс нельзя.
        // абстрактный метод - должен быть обязательно переопределен в следующем классе. @OVERRIDE - дописывается автоматически.
        // однако, если убрать данное описание то исчезает свойства полиморфизма.
        // интерфейсы (чем отличаются от абстрактных классов = СОБЕСЕДОВАНИЕ.) - они все не явно публичные. Имплементируем
        // дополнительные методы. Имплементировать можно много интерфейсов. - нет полей (!) статическое и финализируемое. FINAL -
        // переменная инициализируется один раз и изменить ее нельзя (!)
        // инициализировать переменную необходимо обязательно. Поведение. Default - дефолтный метод, например. Поведение всегда
        // используется.
        // static - атрибут принадлежит как бы ко всем экземплярам. К ним обращаются через класс!!!
        // Сколько раз создавался экземпляр класса?
        // внутри статических методов можно обращаться только к статическим полям.
        sc.close();

    }
}
