package new_homework;

public class Main {
    public static void main(String[] args) {
        NewMassThree ourBus = new NewMassThree();
        NewMassThree firstBus = new NewMassThree();
        NewMassThree secondBus = new NewMassThree();

        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Grey";

        ourBus.showColor();
        secondBus.showColor();
        firstBus.showColor();
    }
}
