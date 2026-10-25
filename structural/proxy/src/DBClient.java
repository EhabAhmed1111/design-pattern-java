import db.Database;
import db.JDBCProxy;

public class DBClient {
    private final Database database;
    public DBClient(Database database) {
        this.database = database;
    }

    public void connectToDatabase() {
        System.out.println("Connecting to database... from client");
        database.connect();
    }

    public void disconnectFromDatabase() {
        System.out.println("Disconnecting from database... from client");
        database.disconnect();
    }


}
