package lesson_7;

public class ApplicationsTwo {
    public static void main(String[] args) {
        Phone phone = new Phone("+3752933376", "Samsung", 80);
        Phone phone1 = new Phone("+3752944488", "Nokia", 120);
        Phone phone2 = new Phone("+3756677744", "BlueBird", 220);

        phone.sendMessage("2312312","23123123","2132131");
        System.out.println();
        phone.dysplay();
        System.out.println();
        System.out.println(phone);




    }
}
