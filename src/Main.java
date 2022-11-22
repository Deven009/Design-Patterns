import builder.*;
import decorator.BasicCloudStream;
import decorator.CloudStream;
import decorator.CompressCloudStream;
import decorator.EncryptedCloudStream;
import observer.DataSource;
import observer.User;
import singleton.Data;

public class Main {
    public static void main(String[] args) {
        // Observer Pattern
        DataSource dataSource = new DataSource(5);
        User userA = new User();
        User userB = new User();
        dataSource.addSubscriber(userA);
        dataSource.addSubscriber(userB);
        dataSource.setValue(10);

        // Decorator Pattern
        CloudStream basicCloudStream = new BasicCloudStream();
        CompressCloudStream compressedCloudStream = new CompressCloudStream();
        EncryptedCloudStream encryptedCloudStream = new EncryptedCloudStream();
        compressedCloudStream.add(basicCloudStream);
        encryptedCloudStream.add(compressedCloudStream);
        encryptedCloudStream.write("123-123-123");

        // Singleton Pattern
        Data.getInstance().setDataValue(5);
        int value = Data.getInstance().getDataValue();
        System.out.println("Value " + value);
        Data.getInstance().setDataValue(10);
        value = Data.getInstance().getDataValue();
        System.out.println("Value " + value);

        // Builder Pattern
        Director director = new Director();
        StudentBuilder studentBuilder = new StudentBuilder();
        ProfessorBuilder professorBuilder = new ProfessorBuilder();
        director.constructStudent(studentBuilder);
        director.constructProfessor(professorBuilder);
        Student student = studentBuilder.getResult();
        Professor professor = professorBuilder.getResult();
        System.out.println("Student hours " + student.getHours());
        System.out.println("Professor hours " + professor.getHours());
    }
}