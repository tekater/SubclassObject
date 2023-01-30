package example;

import java.util.Date;

public class Employee extends Person{
    protected Date startDate;
    protected long salary;


    // Генерируем Getters and Setters


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
