import java.sql.*;

public class ConnectToDB {

    public void getContact(Statement stmt) throws SQLException {
        ResultSet rs = stmt.executeQuery("select * from contacts order by id");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
    }

    public void getContactByID(Statement stmt, int id) throws SQLException {
        ResultSet rs = stmt.executeQuery("select * from contacts where id = " + id);
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
    }

    public void deleteByID(Statement stmt, int id) throws SQLException {
        String db = "DELETE FROM contacts " +
                "WHERE id = " + id;
        stmt.executeUpdate(db);
        ResultSet rs = stmt.executeQuery("select * from contacts");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

    }

    public void insert(Statement stmt, int id, String contact, String contactName) throws SQLException {
        String db = "insert into contacts values (" + id + ", '" + contact + "', '" + contactName + "')";
        stmt.executeUpdate(db);
        ResultSet rs = stmt.executeQuery("select * from contacts order by id");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

    }


}

