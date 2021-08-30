package heavy_rocket;

public abstract class AirMachine extends MainMachine{
    private int Wingspan; // Размах крыльев, м
    private int StringLength; // длина взлетно-посадочной максимальная в метрах м

    public AirMachine(int powerMach, int maxSpeed, int totalMass, String brand, int wingspan, int stringLength) {
        super(powerMach, maxSpeed, totalMass, brand);
        this.Wingspan = wingspan;
        this.StringLength = stringLength;
    }

    public int getWingspan() {
        return Wingspan;
    }

    public int getStringLength() {
        return StringLength;
    }

    public void setWingspan(int wingspan) {
        Wingspan = wingspan;
    }

    public void setStringLength(int stringLength) {
        StringLength = stringLength;
    }
}
