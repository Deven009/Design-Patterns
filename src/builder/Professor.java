package builder;

public class Professor {
    int salary, hours;

    public Professor(int salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
