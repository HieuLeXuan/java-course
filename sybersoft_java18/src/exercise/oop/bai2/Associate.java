package exercise.oop.bai2;

public class Associate extends Base {
    private String name;
    private String id;
    private String phone;
    private float workingDays;

    public Associate() {
    }

    public Associate(String name, String id, String phone, float workingDays) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.workingDays = workingDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void input(int number) {
        System.out.println("Type" + " " + this.getClass().getSimpleName() + " " + number);
        System.out.println("Type id: ");
        scanner.nextLine();
        setId(scanner.nextLine());
        System.out.println("Type name: ");
        setName(scanner.nextLine());
        System.out.println("Type phone: ");
        setPhone(scanner.nextLine());
        System.out.println("Type working days: ");
        setWorkingDays(scanner.nextFloat());
    }

    public float calculateSalary() {
        return 0.0f;
    }

    @Override
    public String toString() {
        return "name= " + getName() + ", id= " + getId() +
                ", phone= " + getPhone() + ", workingDays= " + getWorkingDays();
    }
}
