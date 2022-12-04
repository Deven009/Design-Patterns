import bridge.Abstraction;
import bridge.ConcreteImplementorA;
import bridge.ConcreteImplementorB;
import bridge.RefinedAbstraction;
import builder.*;
import chainOfResponsibility.ConcreteHandler;
import chainOfResponsibility.ConcreteHandler1;
import chainOfResponsibility.ConcreteHandler2;
import chainOfResponsibility.Handler;
import decorator.BasicCloudStream;
import decorator.CloudStream;
import decorator.CompressCloudStream;
import decorator.EncryptedCloudStream;
import observer.DataSource;
import observer.User;
import singleton.Data;
import strategy.Client;
import strategy.ConcreteStrategyA;
import strategy.ConcreteStrategyB;

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

        // Chain Of Responsibility
        Handler h = new ConcreteHandler();
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h2.setNext(h1);
        h1.setNext(h);
        int []requests = { 2, 5, 14, 22, 18, 3, 27, 20};
        for(int i=0;i <requests.length; i++) {
            h2.handleRequest(requests[i]);
        }

        // Bridge
        Abstraction refinedAbstraction = new RefinedAbstraction();
        refinedAbstraction.setImplementor(new ConcreteImplementorA());
        refinedAbstraction.performOperation();
        refinedAbstraction.setImplementor(new ConcreteImplementorB());
        refinedAbstraction.performOperation();

        // Strategy
        Client client = new Client();
        client.setStrategy(new ConcreteStrategyA());
        client.operation();
        client.setStrategy(new ConcreteStrategyB());
        client.operation();
    }
}