package exercise.oop.bai2;

import java.util.Set;

public class Employee extends Associate {

    private String managerId;

    public Employee() {
    }

    public Employee(String name, String id, String phone, float workingDays, float salaryPerDay, String managerId) {
        super(name, id, phone, workingDays, salaryPerDay);
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public void input(int number, Set<Manager> managers) {
        super.input(number);
        System.out.println("Type manager id: ");
        String managerId = scanner.nextLine();
        for (Manager manager: managers) {
            if (managerId.equals(manager.getId())) {
                manager.setEmployeeNum(manager.getEmployeeNum() + 1);
            }
        }
    }

    @Override
    public float caculateSalary() {
        return 100 * getWorkingDays();
    }

    @Override
    public String toString() {
        return  "Employee=" + " " + super.toString() + " " + "managerId=" + managerId + " " + "salary=" + caculateSalary() ;
    }
}
