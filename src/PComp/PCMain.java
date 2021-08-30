package PComp;

import java.util.Scanner;

public class PCMain {
    public static void main(String[] args) {
        String CoPU = "Intel Core I7";
        int RAMem = 256;
        String SSDrive = "HDD";
        int WorkCycle = 3;

        ComputerNew Compic = new ComputerNew(CoPU, RAMem, SSDrive, WorkCycle);

        Compic.Dysplayy();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество циклов");
        int counter = sc.nextInt();

        while (counter > 0) {
            Compic.CompOn();
            counter--;
        }

        sc.close();
    }
}
