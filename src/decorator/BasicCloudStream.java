package decorator;

public class BasicCloudStream implements CloudStream {
    @Override
    public void write(String data) {
        System.out.println("Storing " + data);
    }
}
