package home_w_21_08_2021;

import java.util.Random;

public class StillMassivHW5_2 {
    public static void main(String[] args) {
        System.out.println("Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его\n" +
                "на экран в строку. Определить и вывести на экран сообщение о том, является ли\n" +
                "массив строго возрастающей последовательностью.");
        Random r = new Random();
        int a = 4;
        int Mass3[] = new int[a];
        for (int i = 0; i < a; i++) {
            Mass3[i] = r.nextInt(10);
        }
        System.out.println("Выводим одномерный массив данных");
        for (int i = 0; i < a; i++) {
            System.out.print(Mass3[i] + " ");
        }
        if (Mass3[0] < Mass3[1] && Mass3[1] < Mass3[2] && Mass3[2]< Mass3[3]){
            System.out.println(" Массив строго возрастающий");
        } else {
            System.out.println("Массив не является строго возрастающим");
        }
    }
}
