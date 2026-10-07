package another_example;

public abstract class Handler {
    Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(Request request) ;


}
