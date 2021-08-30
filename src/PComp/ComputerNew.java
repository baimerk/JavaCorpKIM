package PComp;

import java.util.Random;
import java.util.Scanner;

public class ComputerNew {
    private String CoPU;
    private int RAMem;
    private String SSDrive;
    private int WorkCycle;

    public ComputerNew(String CoPU,int RAMem,String SSDrive,int WorkCycle) {
        this.CoPU = CoPU;
        this.RAMem = RAMem;
        this.SSDrive = SSDrive;
        this.WorkCycle = WorkCycle;
    }

    public int RAMem () {
        return RAMem;
    }

    public void setRAMem(int RAMem) {
        this.RAMem = RAMem;
    }

    public void Dysplayy (){
        System.out.printf("Поставка компьютера :\n CoPU %s, \n RAMem %d, \n SSDrive %s, \n WorkCycle %d, \n", this.CoPU, this.RAMem, this.SSDrive,this.WorkCycle);
    }
    // компьютер включен
    public void CompOn (){
        if (this.WorkCycle > 0) {
            Random r = new Random();
            int q = r.nextInt(2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Необходимо включить компьютер, введите переменную 0 или 1");
            System.out.println(q);
            int e = sc.nextInt();
            if (e == q) {

                //sc.close();
                this.WorkCycle--;
                this.CompOff();
            } else {
                System.out.println("Ваш Компьютер сгорел!!!");
                this.WorkCycle = 0;
            }
            //sc.close();
        } else {
            System.out.println("Ресурсы закончены");
        }
    }

    // компьютер выключен
    public void CompOff () {
        if (this.WorkCycle > 0) {
            Random r = new Random();
            int q = r.nextInt(2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Необходимо выключить компьютер, введите переменную 0 или 1");
            System.out.println(q);
            int e = sc.nextInt();

            if (e == q) {
                //sc.close();
                this.WorkCycle--;
                System.out.println("Компьютер выключен успешно, ресурс = " + WorkCycle);
            } else {
                System.out.println("Ваш Компьютер сгорел!!!");
                this.WorkCycle = 0;
            }
            //sc.close();
        }    else {
            System.out.println("Ресурсы закончились");
        }
    }
}
