package singleton;

public class Data {
    private int dataValue;
    private static Data instance;
    private Data() {}

    public static Data getInstance() {
        if(instance == null) instance = new Data();
        return instance;
    }

    public int getDataValue() { return dataValue;}

    public void setDataValue(int value) {
        this.dataValue = value;
    }
}
