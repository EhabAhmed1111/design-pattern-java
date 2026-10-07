public class ThrottlingMiddleware extends BaseMiddleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        currentTime = System.currentTimeMillis();
        this.requestPerMinute = requestPerMinute;
    }

    @Override
    public boolean check(String email, String password)  {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        System.out.println("request increased by 1 : " + request);

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
        }
        return checkNext(email, password);
    }
}
