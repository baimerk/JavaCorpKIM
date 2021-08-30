package lesson_6;

public class Employee extends Person1 {
    private String job;
    private String salary;

    public Employee (String name, int age, String job, String salary) {
        super(name, age);
        this.job = job;
        this.salary = salary;
    }

    public void displayyy() {
        System.out.printf("Info :\n age %d,\n name %s,\n job %s,\n salary %s \n", this.getAge(), this.getName(), this.job, this.salary);
    }

    //public String toString (){

    //}

    //public int getRandomNumber (int a){
        //return new
    //}
}
