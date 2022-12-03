package chainOfResponsibility;

public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest(int req) {
        if(req>=0 && req<10) {
            System.out.println("Hey I will solve: " +  req);
        } else if(next != null) {
            next.handleRequest(req);
        }
    }
}
