package home_w_21_08_2021;

import java.util.Random;

public class StillMassHW8 {
    public static void main(String[] args) {
        System.out.println("Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий\n" +
                "массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего\n" +
                "массива должен равняться отношению элемента из первого массива с i-ым\n" +
                "индексом к элементу из второго массива с i-ым индексом. Вывести все три\n" +
                "массива на экран (каждый на отдельной строке), затем вывести количество\n" +
                "целых элементов в третьем массиве.");
        int a = 10;
        int b = a;
        int c = b;
        int Mass1[] = new int[a];
        int Mass2[] = new int[b];
        double Mass3[] = new double[c];
        Random r = new Random();
        // Инициализированы 3 массива размером 10
        for (int i = 0; i < a; i++) {
            Mass1[i] = r.nextInt(10);
            Mass2[i] = r.nextInt(10);
        }
        System.out.println();
        System.out.println("Первый массив данных");
        for (int i = 0; i < Mass1.length; i++) {
            System.out.print(Mass1[i] + " ");
        }
        System.out.println();
        System.out.println("Второй массив данных");
        for (int i = 0; i < Mass2.length; i++) {
            System.out.print(Mass2[i] + " ");
        }
        System.out.println();
        System.out.println("Третий массив данных, состоит из результата деления каждого элемента массива");
        double y = 0;
        double x = 0;
        double z = 0;
        for (int i = 0; i < c; i++) {
            x = Mass1[i];
            y = Mass2[i];
            z = x / y;
            Mass3[i] = z;
            System.out.print(Mass3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < Mass3.length; i++) {
            if (Mass3[i] % 2 == 0) {
                System.out.println("Элемент массива в ячейке " + i + " является целым числом " + Mass3[i] + " ");
            }
        }
        //System.out.print();
    }
}
