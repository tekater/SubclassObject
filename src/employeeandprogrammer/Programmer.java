package employeeandprogrammer;

public class Programmer extends Employee{
    private int yearsOfExperience;
    public Programmer(long baseSalary, int yearsOfExperience) {
        super(baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }


    //overridden calcSalary
    @Override
    public long calcSalary() {
        return super.baseSalary * yearsOfExperience;
    }
}
