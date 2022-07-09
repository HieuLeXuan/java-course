package exercise.oop.bai2;

public class Company extends Base {

    private String name;
    private String taxId;
    private double monthlyIncome;

    public Company() {
    }

    public Company(String name, String taxId, double monthlyIncome) {
        this.name = name;
        this.taxId = taxId;
        this.monthlyIncome = monthlyIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public void input() {
        System.out.println("Type company name: ");
        scanner.nextLine();
        setName(scanner.nextLine());
        System.out.println("Type company tax id: ");
        setTaxId(scanner.nextLine());
        System.out.println("Type company monthly income: ");
        setMonthlyIncome(scanner.nextDouble());
    }

    @Override
    public String toString() {
        return "Company: " + "name= " + getName() + ", taxId= " + getTaxId() + ", monthlyIncome= " + getMonthlyIncome();
    }
}
