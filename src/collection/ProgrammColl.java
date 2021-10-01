package collection;

import java.util.ArrayList;
import java.util.List;

public class ProgrammColl {
    static class Printer{
        public <T> void print(T[] items){
            for (T item: items){
                System.out.println(item);
            }
        }
    }
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] people = {"Tom","Alice","Sam","Kate","Bob","Helen"};
        Integer[] numbers = {23,4,5,2,13,456,4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);

        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();
        list.add("Godzilla");
        list.add("Tom");
        list.add("Vasya");
        list.add("Arina");
        list.add("Kirill");
        list.add("Anrika");
        list.add(1,"Bob"); // добавляется элемент по индексу 1

        System.out.println(list.get(1));
        list.set(1,"Robert"); // установка нового значения для 2 ого обьекта

        System.out.printf("Arraylist has %d elements \n", list.size());
        for (String person : list){
            System.out.println(person);
        }

        //проверяем наличие элемента
        if (list.contains("Tom")){
            System.out.println("ArrayList contains Tom");
        }

        // удалим несколько элементов
        // удаление конкретного обьекта


        //rawList = list;
        //rawList.add(8);
        //System.out.println(list);
    }


}
