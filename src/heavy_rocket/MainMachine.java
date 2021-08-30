package heavy_rocket;

public abstract class MainMachine {
    private int PowerMach; // мощность в лошадиных силах
    private int MaxSpeed; // максимальная скорость в км.ч
    private int TotalMass; // масса в кг
    private String Brand; // марка

    // гетеры и сеттеры, пока не пойму зачем они обязательно должны быть, они будут обязательно

    public int getPowerMach() {
        return PowerMach;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public int getTotalMass() {
        return TotalMass;
    }

    public String getBrand() {
        return Brand;
    }

    public void setPowerMach(int powerMach) {
        PowerMach = powerMach;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public void setTotalMass(int totalMass) {
        TotalMass = totalMass;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    // метод и конструктор

    public void Display() {
        System.out.printf("Info: \n Мощность: %d лс, \n Максимальная скорость: %d км.ч, \n Общая масса: %d т, \n" +
                " Марка ТС: %s", this.PowerMach, this.MaxSpeed, this.TotalMass, this.Brand);
    }

    public MainMachine(int powerMach, int maxSpeed, int totalMass, String brand) {
        this.PowerMach = powerMach;
        this.MaxSpeed = maxSpeed;
        this.TotalMass = totalMass;
        this.Brand = brand;
    }

}
