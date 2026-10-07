package another_example;

public class Director extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.requestType == RequestType.DIRECTOR) {
            System.out.println("director handle the request " + request.getRequest());
        }else {
            System.out.println("director can not handle the request " + request.getRequest());
            next.handleRequest(request);
        }
    }
}
