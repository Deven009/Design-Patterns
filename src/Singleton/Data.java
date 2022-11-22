package Singleton;

public class Data {
    private int dataValue;
    private static Data instance = new Data();
    private Data() {}

    public static Data getInstance() {
        return instance;
    }

    public int getDataValue() { return dataValue;}

    public void setDataValue(int value) {
        this.dataValue = value;
    }
}
