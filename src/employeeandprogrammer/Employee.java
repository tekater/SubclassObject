package employeeandprogrammer;

public class Employee {
    protected long baseSalary;
    public Employee(long baseSalary) {
        this.baseSalary = baseSalary;
    }
    public long calcSalary() {
        return baseSalary;
    }
}
