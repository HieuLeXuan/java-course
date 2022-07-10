package exercise.oop.bai2.main;

import exercise.oop.bai2.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        CompanyInfoManager companyInfoManager = new CompanyInfoManager();
        Scanner scanner = new Scanner(System.in);

        int choise = 0;
        while (choise != 12) {
            printMenu();
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    inputCompanyInfo(company, scanner);
                    break;
                case 2:
                    if (companyInfoManager.getEmployeeList().size() == 0
                            || companyInfoManager.getManagersList().size() == 0) {
                        System.out.println("The company does not have employee or manager!");
                    } else {
                        addEmployee(companyInfoManager, scanner);
                    }
                    break;
                case 3:
                    addDeleteAssociate(companyInfoManager, scanner);
                    break;
                case 4:
                    printAllAssociate(companyInfoManager);
                    break;
                case 5:
                    printCompanySalary(companyInfoManager);
                    break;
                case 6:
                    printEmployeeHaveMaxSalary(companyInfoManager);
                    break;
                case 7:
                    printManagerHaveMaxEmployee(companyInfoManager);
                    break;
            }
            companyInfoManager.createAssociateList();
            companyInfoManager.getAssociateList().forEach(Associate::calculateSalaryPerMonth);
        }
    }

    static void printEmployeeHaveMaxSalary(CompanyInfoManager companyInfoManager) {
        companyInfoManager.highestSalaryEmployee()
                .forEach(System.out::println);
    }

    static void printManagerHaveMaxEmployee(CompanyInfoManager companyInfoManager) {
        companyInfoManager.managerHaveMaxEmployee()
                .forEach(System.out::println);
    }

    static void printCompanySalary(CompanyInfoManager companyInfoManager) {
        System.out.println("Total of salary all associate: " + companyInfoManager.calculateCompanySalary());
    }

    static void printAllAssociate(CompanyInfoManager companyInfoManager) {
        companyInfoManager.getAssociateList().forEach(System.out::println);
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

    public static void inputCompanyInfo(Company company, Scanner scanner) {
        while (true) {
            System.out.println("\n===COMPANY INFO===");
            System.out.println("Type company name: ");
            scanner.nextLine();
            String companyName = scanner.nextLine();
            System.out.println("Type company tax id: ");
            String taxId = scanner.nextLine();
            if (!checkValidNumber(taxId)) {
                System.out.println("Tax id invalid. Please type again.");
                continue;
            }

            System.out.println("Type company monthly income: ");
            double monthlyIncome = scanner.nextDouble();

            company.setName(companyName);
            company.setTaxId(taxId);
            company.setMonthlyIncome(monthlyIncome);

            System.out.println("Type company info successfully!");
            System.out.println(company);
            break;
        }
    }

    static boolean checkValidNumber(String input) {
        Pattern p = Pattern.compile("[^0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);
        return !m.find();
    }

    public static void addEmployee(CompanyInfoManager companyInfoManager, Scanner scanner) {
        System.out.println("\n===Employee===");
        while (true) {
            System.out.println("Type manager id: ");
            String managerId = scanner.nextLine();
            Manager manager = null;
            try {
                manager = (Manager) companyInfoManager.findEmployeeByCode(managerId);
            } catch (Exception e) {
                System.out.println("Manager id invalid. Please type again!");
            }
        }
    }

    public static void addDeleteAssociate(CompanyInfoManager companyInfoManager, Scanner scanner) {
        int choise = 0;
        while (choise != 4) {
            System.out.println("\n===Add/Delete Associate===");
            System.out.println("1. Add director");
            System.out.println("2. Add manager");
            System.out.println("3. Add employee");
            System.out.println("4. Exit");
            choise = scanner.nextInt();
            switch (choise) {
                case 1: {
                    Director director = new Director(null, null, null, 0, 0);
                    getNormalInfo(companyInfoManager, scanner, director);
                    getManagerInfo(companyInfoManager, scanner, director);
                    companyInfoManager.addDirector(director);
                    break;
                }
                case 2: {
                    Manager manager = new Manager(null, null, null, 0.0f);
                    getNormalInfo(companyInfoManager, scanner, manager);
                    companyInfoManager.addManager(manager);
                    break;
                }
                case 3: {
                    Employee employee = new Employee(null, null, null, 0.0f);
                    getNormalInfo(companyInfoManager, scanner, employee);
                    companyInfoManager.addEmployee(employee);
                    break;
                }
            }
        }
    }

    private static void getManagerInfo(CompanyInfoManager companyInfoManager, Scanner scanner, Director director) {
        System.out.println("Type stock of director: ");
        int stock = scanner.nextInt();

        director.setStock(stock);
    }

    static void getNormalInfo(CompanyInfoManager companyInfoManager, Scanner scanner, Associate associate) {
        while (true) {
            System.out.println("Type id: ");
            scanner.nextLine();
            String id = scanner.nextLine();
            if (!companyInfoManager.checkValidCode(id)) {
                System.out.println("Id already exists, please enter another id.");
                continue;
            }
            System.out.println("Type name: ");
            String name = scanner.nextLine();
            System.out.println("Type phone: ");
            String phone = scanner.nextLine();
            if (!checkValidNumber(phone)) {
                System.out.println("Phone invalid, please enter another phone.");
                continue;
            }
            System.out.println("Type working days: ");
            float workingDays = scanner.nextFloat();
            if (workingDays < 0 || workingDays > 30) {
                System.out.println("Working day invalid, please enter another working day.");
            }
            associate.setId(id);
            associate.setName(name);
            associate.setPhone(phone);
            associate.setWorkingDays(workingDays);
            break;
        }
    }
}
