package FiveTaskHW;

public class Student {
    private String firstName; // имя
    private String lastName; // фамилия
    private String group; // группа
    private double averageMark; // средняя оценка

    private Student() {
    }

    private Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark; // переменная средней оценки
    }

    public int getScholarship() { // метод, который возвращает сумму стипендии
        int bunRub;
        if (this.averageMark == 5) {
            bunRub = 100;
        } else {
            bunRub = 80;
        }
        return bunRub;
    } // метод по умолчанию.

    public void DysplaygetSolarship() {
        System.out.println(getScholarship());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
