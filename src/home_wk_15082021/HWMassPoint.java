package home_wk_15082021;

import java.util.Random;
import java.util.Scanner;

public class HWMassPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //подключаем сканнер
        Random r = new Random(); // подключаем рендом
        int n;
        System.out.println("Введите пожалуйста размерность массива N*N");

        n = sc.nextInt(); // вводим данны с клавиатуры
        int mass[][] = new int[n][n]; //инициализация массива размера N*N

        int i;
        int j;

        //ниже цикл заполнения массива точками
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                mass[i][j] = r.nextInt(2);
            }
        }

        //for (var k = 0; k < mass.length; k++) {
        //    for (var l = 0; l < mass.length; l++) {
        //        if (mass[k][l] == 0) {
        //            mass[k][l] == 5;
        //        }
        //    }
        //}

        //вывод массива в консоль
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
