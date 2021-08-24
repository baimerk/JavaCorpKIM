package lesson_4_5;

import java.util.Random;

public class PersonOne {
    int Age;
    int Weight;
    public String Name;
    public String LastName;
    boolean AreMarried;

    Random r = new Random();

    // Можно доабвить конструктор явно
    public PersonOne () {
        AreMarried = true;
    }
    // Можно добавить конструктор с параметрами
    public PersonOne(int Age){
        this.Age = Age;
    }

    // блок инициализации представлен ниже
    {
        Age = 32;
        Weight = 85;
        Name = "Kim";
        System.out.println("Block has been initialisation");
    }

    public PersonOne (int Age, int Weight, String Name, String LastName, boolean AreMarried){
        this.Age = Age;
        this.Weight = Weight;
        this.Name = Name;
        this.LastName = LastName;
        this.AreMarried = AreMarried;
    }

}
