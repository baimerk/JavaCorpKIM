package new_homework;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class HWMassChetnChisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println(" Задаем цифру n в которой необходимо посчитать количество нечетных целых чисел");
        int n;
        n = sc.nextInt();
        int k = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                k = k + 1;
            }
            //System.out.print(k);
        }
        System.out.println("Размер нашего массива: ");
        System.out.println(k);
        System.out.println("Определяем массив, записываем и выводим все нечетные числа");
        int gm[] = new int[k];
        for (int i = 0, b = 0; i < n; i++) {
            if (i % 2 != 0) {
                gm[b] = i;
                System.out.print(gm[b] + " ");
                b++;
            }
        }
        System.out.println();
        System.out.println("А теперь в обратную сторону четные числа");
        for (int i = n, b = 0; i > 0; i--) {
            if (i % 2 != 0) {
                gm[b] = i;
                System.out.print(gm[b] + " ");
                b++;
            }
        }
    }
}
