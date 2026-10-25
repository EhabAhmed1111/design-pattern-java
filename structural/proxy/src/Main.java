import db.Database;
import db.JDBC;
import db.JDBCProxy;

void main() {

    Database jdbc = new JDBC("Url", "Ihab", "Password");
    Database proxy = new JDBCProxy(jdbc);
    DBClient client = new DBClient(proxy);

    client.connectToDatabase();

    client.disconnectFromDatabase();

}