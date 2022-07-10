package exercise.oop.bai2;

public class Director extends Associate {

    private int stock;
    private int income;

    public Director(String name, String id, String phone, float workingDays, int stock) {
        super(name, id, phone, workingDays);
        this.stock = stock;
        this.salaryPerDay = 300;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public void calculateSalaryPerMonth() {
        salaryPerMonth = salaryPerDay * workingDays;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", workingDays=" + workingDays +
                ", salaryPerDay=" + salaryPerDay +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
