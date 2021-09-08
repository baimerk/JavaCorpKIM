package lesson_7;

public class PersonMaks {
    private String fullName;
    private int Age;

    public PersonMaks (String fullName,int age){
        this.fullName = fullName;
        this.Age = age;
    }

    public PersonMaks(){
        this.fullName = "Maksim";
        this.Age = 43;
    }

    public void move(){
        System.out.println(this.fullName + "Walk");
    }

    public void talk(){
        System.out.println(this.Age + "Talk");
    }
}
