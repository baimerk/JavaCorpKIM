package home_w_21_08_2021;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class StillMassivHW {
    public static void main(String[] args) {
        System.out.println("Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите\n" +
                "массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете\n" +
                "это количество на экран на отдельной строке.");
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        // мы задали переменную со случайным числом
        int n = 15;
        // ниже инициализируем массив переменных размера N
        int MassMaks[] = new int[n]; // массив размера N
        for (int i = 0; i < n; i++) {
            MassMaks[i] = r.nextInt(15);
        }
        // и записываем в него случайные числа от 0 до 15 размера N
        // ниже представлен цикл вывода массива
        for (int i = 0; i < n; i++) {
            System.out.print(MassMaks[i] + " ");
        }

        // далее нам необходимо определить кол-во четных элементов в массиве и вывести его на экран
        // определяем это циклом и перебором по циклу
        int k = 0; // инициализируем переменную равную нулю, записываем в нее количество нечетных
        for (int i = 0; i < MassMaks.length; i++) {
            if (MassMaks[i] % 2 != 0) {
                k++;
            }
            //System.out.println("Количество четных в массиве = "+k);
        }
        System.out.println();
        System.out.print("Количество нечетных в массиве = " + k);
        int m = 0;
        for (int i = 0; i < MassMaks.length; i++) {
            if (MassMaks[i] % 2 == 0) {
                m++;
            }
        }
        System.out.println();
        System.out.print("Количество четных в массиве = " + m);
        System.out.println();
        System.out.println();
        System.out.println("Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите\n" +
                "массив на экран в строку. Замените каждый элемент с нечётным индексом на\n" +
                "ноль. Снова выведете массив на экран на отдельной строке.");
        Random y = new Random();
        int u = 20;
        int MassTwenty[] = new int[u]; // массив размера U
        for (int i = 0; i < u; i++) {
            MassTwenty[i] = r.nextInt(20);
        }
        System.out.println();
        System.out.print("Выводим массив со случайными числами от 0 до 20");
        System.out.println();
        for (int i = 0; i < u; i++) {
            System.out.print(MassTwenty[i] + " ");
        }
        // далее вычисляем перебором все нечетные значения массива и заменяем их на ноль
        //System.out.print("Выводим массив со случайными числами от 0 до 20");

        for (int i = 0; i < MassTwenty.length; i++) {
            if (MassTwenty[i] % 2 != 0) {
                MassTwenty[i] = 0;
            }
        }
        System.out.println();
        System.out.println("Выводим массив, в котором все нечетные заменены на ноль");
        for (int i = 0; i < u; i++) {
            System.out.print(MassTwenty[i] + " ");
        }
    }
}
