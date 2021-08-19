package home_wk_15082021;

import java.util.Random;

public class HWMassPointChar {
    public static void main(String[] args) {
        Random r = new Random();
        char kir[][] = new char[4][4];

        for (char i = 0; i < kir.length; i++) {
            for (char j = 0; j < kir.length; j++) {
                kir[i][j] = 'D';
            }
        }
        for (var i = 0; i < kir.length; i++) {
            for (var j = 0; j < kir.length; j++) {
                if (kir[i][j] == 'D') {
                    kir[i][j] = ' ';
                } else {
                    kir[i][j] = '.';
                }
            }
        }
        kir[0][3] = '.';
        kir[1][3] = '.';
        kir[1][2] = '.';
        kir[2][3] = '.';
        kir[2][2] = '.';
        kir[2][1] = '.';
        kir[3][3] = '.';
        kir[3][2] = '.';
        kir[3][1] = '.';
        kir[3][0] = '.';

        for (int i = 0; i < kir.length; i++) {
            for (int j = 0; j < kir.length; j++) {
                System.out.print(kir[i][j] + " ");
            }
            System.out.println();
        }
    }
}
