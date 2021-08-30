package lesson_6;

public class InxDemo {
    public static void main(String[] args) {
        Person1 person1 = new Person1("name", 5);
        Employee employee = new Employee("name2",66,"dev","7000$");
        //System.out.println(person1.getName());
        //System.out.println(employee.getName());
        employee.setName("name22");
        person1.displayyy();
        //employee.displayyy();
        //System.out.println(employee.toString());
        // переопределение - возможность переопределить свойства методов
        // полиморфизм - методы присущие обоим классам, но обладающие всеми свойствами классов
        //Person1 p = new Employee("S",4,"job", "5000$");
        //p.displayyy();
    }
}
