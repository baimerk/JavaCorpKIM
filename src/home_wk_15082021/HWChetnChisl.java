package home_wk_15082021;

import java.util.Random;
import java.util.Scanner;

public class HWChetnChisl {
    public static void main(String[] args) {
        System.out.println("Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы\n" +
                "массива на экран сначала в строку, отделяя один элемент от другого пробелом, а\n" +
                "затем в столбик (отделяя один элемент от другого началом новой строки). Перед\n" +
                "созданием массива подумайте, какого он будет размера.");
        System.out.println("Для начала придумаем размер матрицы и введем Сканер и Рендом");
        Scanner sc = new Scanner(System.in);
        Random r = new Random(); // создаем объект типа рендом
        int n;
        n = sc.nextInt(); // вводим n с клавиатуры
        int mass[]=new int[n]; //Инициализация массива n

        // для начала вспомним как содать перебор четных чисел и как их записать в матрицу
        for (int i=2, b=0;i<=20;i++){
            if (i % 2 == 0){
                //System.out.print(i);
                mass[b]=i;
                System.out.print(mass[b]+" ");
                b++;
            }
            //mass[n]=;
            //System.out.print(mass[i] + " ");
        }
        //for (int i=0;i<=n;i++){
        //    System.out.print(mass[i]+ " ");
        //}
        //System.out.println();
    }
}
