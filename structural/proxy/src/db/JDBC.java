package db;

public class JDBC implements Database {

    private String url;
    private String user;
    private String password;


    public  JDBC(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to database... through real Object " + this.getClass().getName());
        System.out.println("Url " + this.url);
        System.out.println("Username " + this.user);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from database... through real Object " + this.getClass().getName());
    }
}
