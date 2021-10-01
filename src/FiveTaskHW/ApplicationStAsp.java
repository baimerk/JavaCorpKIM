package FiveTaskHW;

public class ApplicationStAsp {
    public static void main(String[] args) {
        Student student = new Aspirant("Vasya", "Kolesnikov", "F", 5, "Большевики были правы");
        Student student1 = new Aspirant("Szeka", "Sazonov", "135mt", 6, "Квантовые потоки");
        Student student2 = new Aspirant("Gena", "Turbo", "214mv", 5, "To be or not to be");
        Student[] arr = new Student[4];
        //arr[0] = student;
        arr[1] = student;
        arr[2] = student1;
        arr[3] = student2;
        for (int i = 1; i < arr.length; i++) {
            System.out.println();
            arr[i].Dysplay();
            arr[i].DysplaygetSolarship();
        }

    }
}
