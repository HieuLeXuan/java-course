package exercise.oop.bai2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompanyInfoManager {

    List<Director> directorList;
    List<Manager> managersList;
    List<Employee> employeeList;
    List<Associate> associateList;

    public CompanyInfoManager() {
        this.directorList = new ArrayList<>();
        this.managersList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
        this.associateList = new ArrayList<>();
    }

    public List<Director> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
    }

    public List<Manager> getManagersList() {
        return managersList;
    }

    public void setManagersList(List<Manager> managersList) {
        this.managersList = managersList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Associate> getAssociateList() {
        return associateList;
    }

    public void setAssociateList(List<Associate> associateList) {
        this.associateList = associateList;
    }

    public Associate findEmployeeByCode(String staffId) {
        createAssociateList();
        return employeeList.stream()
                .filter( n -> n.getId().equals(staffId))
                .collect(Collectors.toList()).get(0);
    }

    public void createAssociateList() {
        associateList = Stream.of(directorList, managersList, employeeList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public boolean checkValidCode(String inputId) {
        return employeeList.stream().noneMatch(n -> n.getId().equals(inputId));
    }

    public void addDirector(Director ... director) {
        directorList.addAll(Arrays.asList(director));
    }

    public void addManager(Manager ... manager) {
        managersList.addAll(Arrays.asList(manager));
    }

    public void addEmployee(Employee ... employee) {
        employeeList.addAll(Arrays.asList(employee));
    }

    public float calculateCompanySalary() {
        int output = 0;
        createAssociateList();
        for (Employee e : employeeList) {
            e.calculateSalaryPerMonth();
            output += e.salaryPerMonth;
        }
        return output;
    }

    public List<Associate> highestSalaryEmployee() {
        for (Associate employee: employeeList) {
            employee.calculateSalaryPerMonth();
        }
        List<Float> salaryList = employeeList
                .stream()
                .map(emp -> emp.salaryPerMonth)
                .collect(Collectors.toList());
        return employeeList
                .stream()
                .filter(emp -> emp.salaryPerMonth == Collections.max(salaryList))
                .collect(Collectors.toList());
    }

    public List<Associate> managerHaveMaxEmployee() {
        List<Integer> employeeOfManagerList = managersList
                .stream()
                .map(Manager::getNumOfStaff)
                .collect(Collectors.toList());
        return managersList
                .stream()
                .filter(manager -> manager.getNumOfStaff() == Collections.max(employeeOfManagerList))
                .collect(Collectors.toList());
    }

    public void nameOderASC() {
        this.associateList.sort(Comparator.comparing(Associate::getName));
    }

    public void salaryOrderDESC() {
        for (Associate associate : associateList) {
            associate.calculateSalaryPerMonth();
        }
        this.associateList.sort((associate1, associate2) -> (int) (associate1.getSalaryPerMonth() - associate2.getSalaryPerMonth()));
    }

    public List<Associate> directorHaveMaxStock() {
        List<Integer> stockList = directorList
                .stream()
                .map(director -> director.getStock())
                .collect(Collectors.toList());
        return directorList
                .stream()
                .filter(director -> director.getStock() == Collections.max(stockList))
                .collect(Collectors.toList());
    }
}
