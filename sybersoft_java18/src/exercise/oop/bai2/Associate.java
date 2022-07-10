package exercise.oop.bai2;

public abstract class Associate {
    protected String id;
    protected String name;
    protected String phone;
    protected float workingDays;
    protected float salaryPerDay;
    protected float salaryPerMonth;

    public Associate() {
    }

    public Associate(String name, String id, String phone, float workingDays) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.workingDays = workingDays;
    }

    public abstract void calculateSalaryPerMonth();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(float workingDays) {
        this.workingDays = workingDays;
    }

    public float getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(float salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public float getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(float salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }
}
