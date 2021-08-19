package home_wk_15082021;

public class HWForCmDuym {
    public static void main(String[] args) {
        double d; // инициализируем дюйм
        double b; // инициализируем результат

        //for (int i = 0; i < 20; i++) {
        //    System.out.println(i + " ");
        //}
        //System.out.println();
        d = 2.54;
        for (int i = 0; i < 20; i++) {
            //System.out.println(i+" ");
            //for (int j=0;j<20;j++) {
            b = i * d;
            System.out.println(i + " см = " + b+" Дюймов");
            //}

        }
    }
}
