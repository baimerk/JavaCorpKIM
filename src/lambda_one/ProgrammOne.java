package lambda_one;

public class ProgrammOne {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // узнает он об этом в Runtime. Подписка на событие происходит постоянно. Event subscribe.
        //sw.consumer = lamp;
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        //class Fire implements ElectricityConsumer{

        //    @Override
        //    public void electricityOn() {
        //        System.out.println("Пожар!");
        //    }
        //}

        sw.addElectricityListener( sender-> System.out.println("Пожар!!!"));

        //анонимные классы - описание класса и создание объекта этого класса.

        sw.switchOn();
    }
}
