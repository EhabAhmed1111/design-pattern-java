package another_example;

public class Member extends Handler{

    @Override
    public void handleRequest(Request request) {
        if (request.requestType == RequestType.MEMBER) {
            System.out.println("member handle the request" + request.getRequest());
        }else {
            System.out.println("member can not handle the request");
            next.handleRequest(request);
        }
    }
}
