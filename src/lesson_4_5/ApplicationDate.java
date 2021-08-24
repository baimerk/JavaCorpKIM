package lesson_4_5;

public class ApplicationDate {
    public static void main(String[] args) {
        PersonOne Person = new PersonOne();
        System.out.println(Person.Age);
        System.out.println(Person.Name);

        PersonOne PersonTwo = new PersonOne();
        System.out.println(PersonTwo.Weight);

        PersonOne PersonThree = new PersonOne(37);
        System.out.println(Person.Age);
        System.out.println(PersonThree.Age);

        PersonOne Person4 = new PersonOne(44,75,"Kirill","Golovin",false);
        System.out.println(Person4.Age);
        System.out.println(Person4.Weight);
        System.out.println(Person4.Name);
        System.out.println(Person4.LastName);
        System.out.println(Person4.AreMarried);

        ModificatorAccept Accept = new ModificatorAccept();
        //Accept.display();
        Accept.setAge(11);
        //System.out.println();

    }
}
