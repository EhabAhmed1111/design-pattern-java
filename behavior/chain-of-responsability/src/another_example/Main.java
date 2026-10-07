package another_example;

public class Main {

    static void main() {
        Handler ceo = new CEO();
        Handler director = new Director();
        Handler member = new Member();

        // set which handler is next to which
        member.setNext(director);
        director.setNext(ceo);

//        Handler handler = new Member();
        // Set the first handler
//        handler.setNext(member);

        Request request = new Request();
        request.setRequest("file a complaining");
        request.setRequestType(RequestType.CEO);

        member.handleRequest(request);

    }
}
