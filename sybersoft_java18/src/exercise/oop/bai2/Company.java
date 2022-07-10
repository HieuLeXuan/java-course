package exercise.oop.bai2;

public class Company {

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

    @Override
    public String toString() {
        return "Company{" +
                "name='" + this.name + '\'' +
                ", taxId='" + this.taxId + '\'' +
                ", monthlyIncome=" + this.monthlyIncome +
                '}';
    }
}
