package lesson_15_rep_14_13_12_11_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProgrammStreamAPI {
    public static void main(String[] args) {
        //ArrayList<String> names = new ArrayList<String>();
        List<String> names = new ArrayList<String>();
        Collections.addAll(names,"ToM","LamaL","NikoN","JamaJ","OlegelO","MikiM", "KonaN");
        System.out.println(names);

        PalinDrom polinDrom = new PalinDrom();

        List<String> filterNames = names.stream()
                .filter(s ->s.length()<=5)
                .collect(Collectors.toList());
        for (String s: filterNames){
            System.out.println(s);
        }

        // есть числа от 0 до n. Числа в своем написании имеют цифру 2. Посчитать количество цифр всего
    }
}
