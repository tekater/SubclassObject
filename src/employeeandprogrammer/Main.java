package employeeandprogrammer;

public class Main {
    public static void main(String[] args) {
        Employee one = new Employee(500);
        System.out.println(one.calcSalary());
        Employee a = new Programmer(500, 2);
        System.out.println(a.calcSalary());

    }
}
