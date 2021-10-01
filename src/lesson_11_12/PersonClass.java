package lesson_11_12;

public class PersonClass {

    private String name;

    public PersonClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
