package heavy_rocket;

public class WarriorAir extends AirMachine{
    private int RocketSc;
    private boolean SystemBreaks;

    public WarriorAir(int powerMach, int maxSpeed, int totalMass, String brand, int wingspan, int stringLength, int rocketSc,boolean systemBreaks) {
        super(powerMach, maxSpeed, totalMass, brand, wingspan, stringLength);
        this.RocketSc = rocketSc;
        this.SystemBreaks = systemBreaks;
    }

    public double CountPower(){
        double power = this.getPowerMach()*0.74;
        return power;
    }

    // разработать метод описание, который будет возвращать составленную строку с описанием всех объектов
    public void DescriptionAll(){
        System.out.printf("Info: \n" +
                "Мощность: %f квт,\n Максимальная скорость: %d км.ч, \n Общая масса: %d т, \n, Марка: %s, \n" +
                "Количество ракет: %d, \n Бизнес-класс %d,", this.CountPower(),this.getMaxSpeed(),this.getTotalMass(),this.getBrand(),this.getWingspan(),this.getStringLength(),this.RocketSc,this.SystemBreaks);
    }

}
