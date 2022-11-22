package builder;

public class Director {
    public void constructStudent(Builder builder) {
        builder.setSalary("10").setHours("20");
    }
    public void constructProfessor(Builder builder) {
        builder.setSalary("50");
        builder.setHours("40");
    }
}
