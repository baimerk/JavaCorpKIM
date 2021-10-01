package lesson_11_12;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<PersonClass> list = new ArrayList<>();

        PersonClass personClass = new PersonClass("White");
        PersonClass personClass1 = new PersonClass("Lion");

        list.add(personClass);
        list.add(personClass1);

        list.contains(personClass);

    }
}
