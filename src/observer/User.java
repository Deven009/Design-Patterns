package observer;

public class User implements Subscriber {
    @Override
    public void update(Publisher publisher) {
        int valueFromPublisher = ((DataSource)publisher).getValue();
        System.out.println("Value Received : " + valueFromPublisher);
    }
}
