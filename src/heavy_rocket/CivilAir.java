package heavy_rocket;

public class CivilAir extends AirMachine{
    private int PassScore; // вообще это поле есть в соседнем классе на уровне родителя чилда
    private boolean Business;

    public CivilAir(int powerMach, int maxSpeed, int totalMass, String brand, int wingspan, int stringLength, int passScore, boolean business) {
        super(powerMach, maxSpeed, totalMass, brand, wingspan, stringLength);
        this.PassScore = passScore;
        this.Business = business;
    }

    // разработать метод описание, который будет возвращать составленную строку с описанием всех объектов
    public void DescriptionAll() {
        System.out.printf("Info: \n" +
                "Мощность: %f квт,\nМаксимальная скорость: %d км.ч, \nОбщая масса: %d тонн, \nМарка: %s, \n" +
                "Количество колес: %d штук, \nРасход топлива: %s литров в секунду, \nКоличество пассажиров: %d, \nТип класса полета: %s.", this.CountPower(), this.getMaxSpeed(), this.getTotalMass(), this.getBrand(), this.getWingspan(), this.getStringLength(), this.PassScore, this.Business);
    }

    public double CountPower() {
        double power = this.getPowerMach() * 0.74;
        return power;
    }

}
