package exercise.oop.bai2;

public class Manager extends Associate {

    private int numOfStaff;

    public Manager(String name, String id, String phone, float workingDays) {
        super(name, id, phone, workingDays);
        this.salaryPerDay = 200;
    }

    public int getNumOfStaff() {
        return numOfStaff;
    }

    public void setNumOfStaff(int numOfStaff) {
        this.numOfStaff = numOfStaff;
    }

    @Override
    public void calculateSalaryPerMonth() {
        salaryPerMonth = salaryPerDay * workingDays;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", workingDays=" + workingDays +
                ", salaryPerDay=" + salaryPerDay +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
