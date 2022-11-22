package decorator;

public class CompressCloudStream extends CloudStreamDecorator {

    public String compress(String data) {
        return data.substring(0,3);
    }

    @Override
    public void  write(String data) {
        System.out.println("Calling compression");
        String compressedData = compress(data);
        super.write(compressedData);
    }
}
