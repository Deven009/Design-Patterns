package Decorator;

public abstract class CloudStreamDecorator implements CloudStream {
    private CloudStream cloudStream;

    public void add(CloudStream cloudStream) {
        this.cloudStream = cloudStream;
    }

    @Override
    public void write(String data) {
        this.cloudStream.write(data);
    }
}
