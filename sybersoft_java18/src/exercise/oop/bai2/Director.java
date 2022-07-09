package exercise.oop.bai2;

public class Director extends Associate {

    private float percentageOfShares;

    public Director() {

    }

    public Director(float percentageOfShares) {
        this.percentageOfShares = percentageOfShares;
    }

    public Director(String name, String id, String phone, float workingDays, float salaryPerDay, float percentageOfShares) {
        super(name, id, phone, workingDays, salaryPerDay);
        this.percentageOfShares = percentageOfShares;
    }

    public float getPercentageOfShares() {
        return percentageOfShares;
    }

    public void setPercentageOfShares(float percentageOfShares) {
        this.percentageOfShares = percentageOfShares;
    }

    @Override
    public void input(int number) {
        super.input(number);

        System.out.println("Type percent of shares: ");
        setPercentageOfShares(scanner.nextFloat());
    }

    @Override
    public float caculateSalary() {
        return 300 * getWorkingDays();
    }

    @Override
    public String toString() {
        return "Director: " + super.toString() + ", percentageOfShares=" + getPercentageOfShares()  + ", salary=" + caculateSalary();
    }
}
