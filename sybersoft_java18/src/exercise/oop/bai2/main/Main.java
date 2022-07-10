package exercise.oop.bai2.main;

import exercise.oop.bai2.*;

import java.util.HashSet;
import java.util.Set;

public class Main extends Base {
    private static Company company = new Company();
    private static Set<Employee> employees = new HashSet<>();
    private static Set<Manager> managers = new HashSet<>();
    private static Set<Director> directors = new HashSet<>();

    public static void main(String[] args) {
        int choise = 0;
        while (choise != 12) {
            printMenu();
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    addCompany();
                    break;
                case 2:
                    addEmployee(2);
                    break;
                case 3:
                    addDeleteAssociate();
                    break;
                case 4:
                    System.out.println(company);
                    System.out.println(directors);
                    System.out.println(managers);
                    System.out.println(employees);
                    break;
                case 5:
                    try {
                        System.out.println("Total salary of all employee in " + company.getName().toUpperCase() + " company: " + totalSalaryOfEmployees());
                    } catch (Exception e) {
                        System.out.println("Please type company info!");
                    }
                    break;
                case 6:
                    getEmployeeHasHighestSalary();
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("===============================MENU===============================");
        System.out.println("1. Type company info");
        System.out.println("2. Staff allocation");
        System.out.println("3. Add/Delete associate");
        System.out.println("4. Print all info people in company");
        System.out.println("5. Province and export the total number of employees");
        System.out.println("6. Highest paid employee");
        System.out.println("7. The manager has many employees to pick up");
        System.out.println("8. Sort all employees alphabetically");
        System.out.println("9. Sort all employees in descending order");
        System.out.println("10. The director with the most shares");
        System.out.println("11. Province and output the total income of each director");
        System.out.println("12. Exit");
        System.out.println("=================================================================");
    }

    public static void addCompany() {
        System.out.println("======Company======");
        if (company.getName() == null) {
            company.input();
        } else {
            System.out.println("Company data already available!");
        }
    }

    public static void addDirector() {
        System.out.println("======Director======");
        System.out.println("Type number of director: ");
        int numOfDirector = scanner.nextInt();
        if (numOfDirector > 0) {
            for (int i = 0; i < numOfDirector; i++) {
                Director director = new Director();
                director.input(i + 1);
                directors.add(director);
            }
        }
    }

    public static void addManager() {
        System.out.println("======Manager======");
        System.out.println("Type number of manager: ");
        int numOfManager = scanner.nextInt();
        for (int i = 0; i < numOfManager; i++) {
            Manager manager = new Manager();
            manager.input(i + 1);
            managers.add(manager);
        }
    }

    public static void addEmployee(int cases) {
        System.out.println("======Employee======");
        if (cases == 2) {
            System.out.println("Type employee id you want to add: ");
            scanner.nextLine();
            String employeeId = scanner.nextLine();

            if (employees.size() != 0) {
                for (Employee employee : employees) {
                    if (employeeId.equals(employee.getId())) {
                        System.out.println("Employee found.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                }
            } else {
                System.out.println("Employee not found.");
            }
        } else {
            System.out.println("Type number of employee you want to add: ");
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                Employee employee = new Employee();
                employee.input(i + 1, managers);
                employees.add(employee);
            }
        }

    }

    public static void addDeleteAssociate() {
        System.out.println("Enter type you want to chose (Add: 1/ Delete: 0): ");
        int type = scanner.nextInt();
        if (type == 1 || type == 0) {
            int choise = 0;
            while (choise != 4) {
                System.out.println("1. Director");
                System.out.println("2. Managers");
                System.out.println("3. Employees");
                System.out.println("4. Exit");
                choise = scanner.nextInt();

                switch (choise) {
                    case 1:
                        if (type == 1) {
                            addDirector();
                        } else {
                            System.out.println("remove");
                        }
                        break;
                    case 2:
                        if (type == 1) {
                            addManager();
                        } else {
                            System.out.println("remove");
                        }
                        break;
                    case 3:
                        if (type == 1) {
                            addEmployee(3);
                        } else {
                            System.out.println("remove");
                        }
                        break;
                }
            }
        }
    }

    public static float totalSalaryOfEmployees() {
        float totalSalary = 0.0f;
        if (directors != null && managers != null && employees != null) {
            for (Director director : directors) {
                totalSalary += director.calculateSalary();
            }
            for (Manager manager : managers) {
                totalSalary += manager.calculateSalary();
            }
            for (Employee employee : employees) {
                totalSalary += employee.calculateSalary();
            }
        } else {
            System.out.println("Please type employees info!");
        }
        return totalSalary;
    }

    public static void getEmployeeHasHighestSalary() {
        float max = 0.0f;
        for (Employee employee : employees) {
            if (employee.calculateSalary() > max) {
                max = employee.calculateSalary();
                System.out.println("Employee has salary highest " + "{ " + employee + " }");
            }
        }

    }

}
