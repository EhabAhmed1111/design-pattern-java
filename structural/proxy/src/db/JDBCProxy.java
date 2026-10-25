package db;

public class JDBCProxy implements Database{

private final Database database;

    public JDBCProxy(Database database) {
        this.database = database;
    }

    @Override
    public void connect() {
        System.out.println("Act as there is some filters");
        System.out.println("Send the req from proxy to real object");
        database.connect();
        System.out.println("Acted there is some cache or some logs");
    }

    @Override
    public void disconnect() {
        System.out.println("Act as there is some filters");
        System.out.println("Send the req from proxy to real object");
        database.disconnect();
        System.out.println("Acted there is some logs");
    }
}
