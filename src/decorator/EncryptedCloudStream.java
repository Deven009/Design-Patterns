package decorator;

public class EncryptedCloudStream extends CloudStreamDecorator {

    public String encrypt(String data) {
        return data + "@encrypted";
    }

    @Override
    public void  write(String data) {
        System.out.println("Calling encryption");
        String encryptedData = encrypt(data);
        super.write(encryptedData);
    }
}
