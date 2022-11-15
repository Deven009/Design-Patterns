import observer.DataSource;
import observer.User;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource(5);
        User userA = new User();
        User userB = new User();
        dataSource.addSubscriber(userA);
        dataSource.addSubscriber(userB);
        dataSource.setValue(10);
    }
}