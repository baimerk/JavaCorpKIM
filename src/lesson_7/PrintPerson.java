package lesson_7;

public class PrintPerson {
    public static void main(String[] args) {
        PersonMaks personMaks = new PersonMaks("Дракон василий", 77);
        personMaks.move();
        personMaks.talk();
        System.out.println();

        PersonMaks personMaks1 = new PersonMaks();

        personMaks1.talk();
        personMaks1.move();
    }
}
