package chainOfResponsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int req) {
        if(req>=20 && req<30) {
            System.out.println("Hey 2 will solve: " +  req);
        } else if(next != null) {
            next.handleRequest(req);
        }
    }
}
