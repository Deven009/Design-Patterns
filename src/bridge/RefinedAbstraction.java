package bridge;

public class RefinedAbstraction implements Abstraction {
    Implementor implementor;

    @Override
    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void performOperation() {
        implementor.operation();
    }
}
