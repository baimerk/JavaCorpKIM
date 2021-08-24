package home_w_21_08_2021;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StillMassHW7 {
    public static void main(String[] args) {
        System.out.println("Cоздайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите\n" +
                "какой элемент является в этом массиве максимальным и сообщите индекс его\n" +
                "последнего вхождения в массив.");
        Random r = new Random();
        int a = 12;
        int MassA[] = new int[a];

        for (int i = 0; i < a; i++) {
            MassA[i] = r.nextInt(15);
        }
        for (int i = 0; i < a; i++) {
            System.out.print(MassA[i] + " ");
        }

        int min = MassA[0];
        int max = MassA[0];
        int index = 0;

        for (int i = 0; i < MassA.length; i++) {
            if (MassA[i] < min) {
                min = MassA[i];
            }
            if (MassA[i] > max) {
                max = MassA[i];
                index = i;
                //Arrays.asList((Object)(MassA));
            }
        }
        System.out.println();
        System.out.println("max= " + max + " min " + min);
        System.out.println(index);
        //System.out.print(y);

    }
}
