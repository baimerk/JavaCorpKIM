package lesson_7;

import java.util.Random;
import java.util.Scanner;

public class MMatrix {
    //Scanner sc = Scanner(System.in);
    private double array[][];
    private int line;
    private int columne;

    public MMatrix() {
    }

    public MMatrix(int line, int columne) {
        this.line = line;
        this.columne = columne;
        this.array = new double[line][columne];
        fullArray();
    }

    private void fullArray() {
        Random r = new Random();
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                array[i][j] = r.nextInt(20) * 0.12;
            }
        }
    }

    public void displayArray() {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < columne; j++) {
                System.out.printf("%6.2f", array[i][j]);
            }
            System.out.println();
        }
    }

    public void multiplex(int number) {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                array[i][j] *= number;
            }
        }
    }


    //метод, который возвращает матрицу
    public double[][] generateArray() {
        double[][] array = new double[line][columne];
        Random r = new Random();
        System.out.println("********");
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                array[i][j] = r.nextInt(10);
                System.out.printf("%6.2f",array[i][j]);
            }
            System.out.println();
        }
        return array;
    }

    // мутод который вывод конечную матрицу

    public void sumArray(double[][] array2) {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                this.array[i][j] += array2[i][j];
            }
        }
    }

    //метод перемножающий матрицы
    public void multiplexArray(){

    }
}
