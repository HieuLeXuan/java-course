package exercise.oop.bai2;

public class Employee extends Associate {

    private Manager manager;

    public Employee(String name, String id, String phone, float workingDays) {
        super(name, id, phone, workingDays);
        this.salaryPerDay = 100;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void calculateSalaryPerMonth() {
        salaryPerMonth = salaryPerDay * workingDays;
    }

    @Override
    public String toString() {
        if (manager != null) {
            return "Employee{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", workingDays=" + workingDays +
                    ", manager=" + manager.getName() +
                    '}';
        } else {
            return "Employee{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", workingDays=" + workingDays +
                    ", manager=" + manager +
                    ", salaryPerMonth=" + salaryPerMonth +
                    '}';
        }
    }
}
