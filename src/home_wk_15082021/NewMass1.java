package home_wk_15082021;

import java.util.Scanner;
import java.util.SortedMap;

public class NewMass1 {
    public static void main(String[] args) {
        System.out.println("Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в\n" +
                "строку, а затем этот же массив выведите на экран тоже в строку, но в обратном\n" +
                "порядке (99 97 95 93 ... 7 5 3 1).");
        // Возможно можно посчитать размер массива, если взять переменную и прибавлять к ней единику как только условие будет True
        int k = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                k = k + 1;
                //System.out.print(k);
            }
        }
        System.out.print("Массив будет размера - " +k);
        System.out.println();
        int massnew[] = new int[k];
        for (int i = 0, b = 0; i < 100; i++) {
            if (i % 2 != 0) {
                massnew[b] = i;
                System.out.print(massnew[b] + " ");
                b++;
            }
        }
        //System.out.println(k);

        Scanner sc = new Scanner(System.in);
        //System.out.println("Введите размер массива");
        //int n = sc.nextInt();
        //int massnech = new int[k];

    }
}
