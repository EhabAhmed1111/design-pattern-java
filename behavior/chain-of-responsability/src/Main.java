import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws InterruptedException, IOException {

        // Register some users
        Server server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // Create a chain of filters
        BaseMiddleware middleware = BaseMiddleware.link(new UserExistMiddleware(server),new ThrottlingMiddleware(2)
                );

        server.setMiddleware(middleware);
        boolean success ;
        do {
            String name =reader.readLine();
            String password=reader.readLine();
            success = server.logIn(name + "@example.com", password);
        }while (!success);



    }

}
