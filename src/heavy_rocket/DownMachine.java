package heavy_rocket;

public abstract class DownMachine extends MainMachine {
    private int NumbWhile;
    private int OilResourse;

    public DownMachine(int powerMach, int maxSpeed, int totalMass, String brand, int numbWhile, int oilResourse) {
        super(powerMach, maxSpeed, totalMass, brand);
        this.NumbWhile = numbWhile;
        this.OilResourse = oilResourse;
    }

    public int getNumbWhile() {
        return NumbWhile;
    }

    public int getOilResourse() {
        return OilResourse;
    }

    public void setNumbWhile(int numbWhile) {
        NumbWhile = numbWhile;
    }

    public void setOilResourse(int oilResourse) {
        OilResourse = oilResourse;
    }
}
