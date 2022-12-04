package strategy;

public class Client {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operation() {
        strategy.doOperation();;
    }
}
