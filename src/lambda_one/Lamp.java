package lambda_one;

public class Lamp implements ElectricityConsumer {
    // лампу разработали гораздо позже программы включения выключения
    public void lightOn(){
        System.out.println("Лампа зажглась!");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
