package builder;

public class StudentBuilder implements Builder {
    private int salary;
    private int hours;

    public StudentBuilder setSalary(String salary) {
        this.salary = Integer.parseInt(salary);
        return this;
    }

    public StudentBuilder setHours(String hours) {
        this.hours = Integer.parseInt(hours);
        return this;
    }

    public Student getResult() {
        // add validation before creation of object
        return new Student(salary, hours);
    }
}
