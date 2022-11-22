import Decorator.BasicCloudStream;
import Decorator.CloudStream;
import Decorator.CompressCloudStream;
import Decorator.EncryptedCloudStream;
import observer.DataSource;
import observer.User;
import Singleton.Data;

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
    }
}