package home_w_21_08_2021;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class StillMassivHW5 {
    public static void main(String[] args) {
        System.out.println("Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,\n" +
                "выведите массивы на экран в двух отдельных строках. Посчитайте среднее\n" +
                "арифметическое элементов каждого массива и сообщите, для какого из\n" +
                "массивов это значение оказалось больше (либо сообщите, что их средние\n" +
                "арифметические равны).");
        Random r = new Random();
        int a = 5;
        int b = 5;
        int Mass1[] = new int[a];
        int Mass2[] = new int[b];
        for (int i = 0; i < 5; i++) {
            Mass1[i] = r.nextInt(15);
            Mass2[i] = r.nextInt(15);
        }
        System.out.println();
        System.out.println("Выводим оба массива");
        System.out.println();
        System.out.print("Первый массив");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(Mass1[i] + " ");
        }
        System.out.println();
        System.out.println("Второй массив");
        for (int i = 0; i < 5; i++) {
            System.out.print(Mass2[i] + " ");
        }
        System.out.println();
        System.out.println("Посчитаем среднее арифметическое каждого массива и сравним");
        System.out.println();
        double o = 0;
        double l = 0;
        for (int i = 0; i < Mass1.length; i++) {
            o = o + Mass1[i];
        }
        System.out.print("Итого сумма массива = " + o + " Ср.арифм. = " + o / a);
        System.out.println();
        for (int i = 0; i < Mass2.length; i++) {
            l = l + Mass2[i];
        }
        System.out.print("Итого сумма массива 2 = " + l + " Ср.арифм. = " + l / b);
        System.out.println();
        if (o > l) {
            System.out.println("Ср.арифм. массива 1 больше ср.арифм. массива 2 ");
        } else {
            System.out.println("Ср.арифм. массива 2 больше ср.арифм. массива 1 ");
        }
        if (o == l) {
            System.out.println("Оба массива равны");
        }
    }
}
