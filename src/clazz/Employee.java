package clazz;

public class Employee {
    private String fullName;
    private Integer baseSalary;
    private Integer level;

    public Employee(String fullName, Integer baseSalary, Integer level) {
        this.fullName = fullName;
        this.baseSalary = baseSalary;
        this.level = level;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer calculateSalary(Employee e) {
        return e.getLevel() * e.getBaseSalary();
    }

    public static void main(String[] args) {
        Employee e = new Employee("Name", 1000, 2);
        Integer salary = e.calculateSalary(e);
        System.out.println(salary);
    }
}
