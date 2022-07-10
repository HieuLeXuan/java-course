package exercise.oop.bai2;

import java.util.Set;

public class Employee extends Associate {

    private String managerId;

    public Employee() {
    }

    public Employee(String name, String id, String phone, float workingDays, String managerId) {
        super(name, id, phone, workingDays);
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
        scanner.nextLine();
        setManagerId(scanner.nextLine());
        if (managers.size() != 0) {
            String managerId = getManagerId();
            for (Manager manager: managers) {
                if (managerId.equals(manager.getId())) {
                    manager.setEmployeeNum(manager.getEmployeeNum() + 1);
                } else {
                    setManagerId(null);
                }
            }
        } else {
            setManagerId(null);
        }
    }

    @Override
    public float calculateSalary() {
        return 100 * getWorkingDays();
    }

    @Override
    public String toString() {
        return  "Employee: " + " " + super.toString() + ", managerId= " + getManagerId() + ", salary=" + calculateSalary() + '\n' ;
    }
}
