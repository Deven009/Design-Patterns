package chainOfResponsibility;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler nextHandler) {
        this.next = nextHandler;
    }

    public abstract void handleRequest(int request);
}
