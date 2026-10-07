package another_example;

public class CEO extends Handler{

    @Override
    public void handleRequest(Request request) {
        if (request.requestType == RequestType.CEO) {
            System.out.println("CEO handle the request " + request.getRequest());
        }else {
            next.handleRequest(request);
        }
    }
}
