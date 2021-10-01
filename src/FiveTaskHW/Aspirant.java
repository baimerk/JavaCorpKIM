package FiveTaskHW;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        int bunRub;
        if (this.getAverageMark() == 5) {
            bunRub = 200;
        } else {
            bunRub = 180;
        }
        return super.getScholarship();
    }

    public void DysplaygetSolarship() {
        System.out.println(getScholarship());
    }
}
