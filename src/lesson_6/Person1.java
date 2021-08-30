package lesson_6;

public class Person1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person1(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void displayyy(){
        System.out.printf("Info : age %d, name %s, \n", this.age, this.name);
    }



}
