package chainOfResponsibility;

public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest(int req) {
        if(req>=10 && req<20) {
            System.out.println("Hey 1 will solve: " +  req);
        } else if(next != null) {
            next.handleRequest(req);
        }
    }
}
