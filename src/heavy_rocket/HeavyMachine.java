package heavy_rocket;

public class HeavyMachine extends DownMachine {
    private int Carrying;

    public HeavyMachine(int powerMach, int maxSpeed, int totalMass, String brand, int numbWhile, int oilResourse, int carrying) {
        super(powerMach, maxSpeed, totalMass, brand, numbWhile, oilResourse);
        this.Carrying = carrying;
    }

    // разработать метод описание, который будет возвращать составленную строку с описанием всех объектов
    public void DescriptionAll() {
        System.out.printf("Info: \n" +
                "Мощность: %f квт,\nМаксимальная скорость: %d км.ч, \nОбщая масса: %d тонн, \nМарка: %s, \n" +
                "Количество колес: %d штук, \nРасход топлива: %s литров в секунду, \nГрузоподъемность: %d тонн.", this.CountPower(), this.getMaxSpeed(), this.getTotalMass(), this.getBrand(), this.getNumbWhile(), this.getOilResourse(), this.Carrying);
    }

    public double CountPower() {
        double power = this.getPowerMach() * 0.74;
        return power;
    }

}
