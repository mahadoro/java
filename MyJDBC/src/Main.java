import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1", "diplom", "orapassword");

            Statement stmt = con.createStatement();

            ConnectToDB connectToDB = new ConnectToDB();
            System.out.println("Get all Contacts");
            connectToDB.getContact(stmt);
            System.out.println("Get a Contact by ID");
            connectToDB.getContactByID(stmt, 2);
            System.out.println("Delete a Contact by ID");
            connectToDB.deleteByID(stmt, 2);
            System.out.println("Add a new Contact");
            connectToDB.insert(stmt, 5, "0665555555", "Lena");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

