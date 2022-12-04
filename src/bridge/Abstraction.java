package bridge;

public interface Abstraction {
    void setImplementor(Implementor implementor);
    void performOperation();
}
