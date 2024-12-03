package MHR.practice.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) throws SQLException {
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);
        Connection conn = instance.getConnection();
        Statement statement = conn.createStatement();
        statement.execute("CREATE table students (ID int PRIMARY KEY, name varchar(65))");
        System.out.println("Create table students");
        int rows = statement.executeUpdate("insert into students (ID, name) values (1, 'Koo')");
        if (rows > 0) {
            System.out.println("Inserted a new row");
        }
        conn.close();
    }
}
