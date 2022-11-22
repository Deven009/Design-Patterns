package builder;

public class ProfessorBuilder implements Builder {
    private int salary, hours;

    public ProfessorBuilder setSalary(String salary) {
        this.salary = Integer.parseInt(salary);
        return this;
    }

    public ProfessorBuilder setHours(String hours) {
        this.hours = Integer.parseInt(hours);
        return this;
    }

    public Professor getResult() {
        // add validation before creation of object
        return new Professor(salary, hours);
    }
}
