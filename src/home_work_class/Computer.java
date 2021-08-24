package home_work;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    int max;
    public String Processor;
    public String OperationMemory;
    public String HardDisk;
    public int Resource; // ресурс полных циклов работы (включений - выключений)
    public boolean Status;


    // Блок инициалиизации ниже
    {
        Processor = "Intel Pentium 300m";
        OperationMemory = "Оперативная память";
        HardDisk = "Жесткий диск Terrabait 700";
        Resource = 2;
        System.out.println("Block has been initialisation");
        //System.out.println("Проверяем включен ли компьютер - секундочку : ");
    }

    // ниже представлен метод "описание"
    public void display() {
        System.out.println(this.Processor + " " + OperationMemory + " " + HardDisk + " " + Resource);
    }

    // Простое включение компьютера с возможным сбоем
    public void randomOnOff() {
        Random r = new Random();
        Status = r.nextBoolean();
        System.out.println("Warning!" + Status);
        if (Status == false) {
            System.out.println();
            System.out.println("Копмьютер выключен");
        } else {
            System.out.println("Компьютер включен");
        }
    }

    // описываем метод включить
    public void Baggg () {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a = r.nextInt(2);

        System.out.println("Введите число с клавиатуры для запуска компьютера: ");
        int b;
        System.out.println(a);
        b = sc.nextInt(); //ввод через сканер

        if (b == a) {
            System.out.println("Вы угадали." + (b == a)); // должен быть вызван метод выключения

        } else {
            System.out.println("Вы не угадали." + (b == a) + " Ваш компьютер сгорел :( "); // должен быть вызван метод компьютер сгорел
        }
    }

    // Когда компьютер включен
    public void ComputerON() {

    }

    // описываем метод выключить
    public void Offline() {
    }

    // метод работа
    public void Working() {
        Random t = new Random();
        Scanner tr = new Scanner(System.in);
        int o;
        o = t.nextInt(10);
        for (int i = 0;i<10;i++) {
            if (o == 10) {
                System.out.println("произошел сбой ...");
            } else {
                System.out.println(".");
            }
        }
    }


}
