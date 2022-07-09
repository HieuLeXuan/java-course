package exercise.oop.bai2;

public class Manager extends Associate {

    private int employeeNum;

    public Manager() {

    }

    public Manager(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public Manager(String name, String id, String phone, float workingDays, float salaryPerDay, int employeeNum) {
        super(name, id, phone, workingDays, salaryPerDay);
        this.employeeNum = employeeNum;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    @Override
    public void input(int number) {
        super.input(number);
    }

    @Override
    public float caculateSalary() {
            return 200 * getWorkingDays() + 100 * this.employeeNum;
    }

    @Override
    public String toString() {
        return "Manager=" + " " + super.toString() + " " + "employeeIds=" + getEmployeeNum() + " " + "salary=" + caculateSalary();
    }
}
