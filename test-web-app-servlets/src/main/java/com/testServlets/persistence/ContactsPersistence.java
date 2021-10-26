package com.testServlets.persistence;

import com.testServlets.bl.ConnectToDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContactsPersistence {
    public static List<String> getContacts() throws Exception {
        List<String> result = new ArrayList<>();
        ResultSet rs = null;
        Connection myConnection = null;
        Statement stmt = null;
        try {
            myConnection = ConnectToDB.initializeDatabase();
            stmt = myConnection.createStatement();
            rs = stmt.executeQuery("select * from contacts order by id");
            while (rs.next())
                result.add(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "<br>");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Problem with connection");
        } finally {
            rs.close();
            stmt.close();
            myConnection.close();
        }
    }

    public static List<String> getContactsById(String id) throws Exception {
        List<String> result = new ArrayList<>();
        ResultSet rs = null;
        Connection myConnection = null;
        Statement stmt = null;
        try {
            myConnection = ConnectToDB.initializeDatabase();
            stmt = myConnection.createStatement();
            rs = stmt.executeQuery("select * from contacts where id = " + id + "order by id");
            while (rs.next())
                result.add(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "<br>");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Problem with connection");
        } finally {
            rs.close();
            stmt.close();
            myConnection.close();
        }
    }

    public static List<String> getContactsByText(String text) throws Exception {
        List<String> result = new ArrayList<>();
        ResultSet rs = null;
        Connection myConnection = null;
        Statement stmt = null;
        try {
            myConnection = ConnectToDB.initializeDatabase();
            stmt = myConnection.createStatement();
            rs = stmt.executeQuery("select * from contacts where id || contact || contact_name like '%" + text + "%'");
            while (rs.next())
                result.add(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "<br>");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Problem with connection");
        } finally {
            rs.close();
            stmt.close();
            myConnection.close();
        }
    }

    public static String deleteContactsById(String id) throws Exception {
        Connection myConnection = null;
        Statement stmt = null;
        try {
            myConnection = ConnectToDB.initializeDatabase();
            stmt = myConnection.createStatement();
            stmt.executeUpdate("delete from contacts where id = " + id);
            return "Line with id = " + id + " was deleted";
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Problem with connection");
        } finally {
            stmt.close();
            myConnection.close();
        }
    }

    public static String postContact(String id, String contact, String contact_name) throws Exception {
        Connection myConnection = null;
        Statement stmt = null;
        try {
            myConnection = ConnectToDB.initializeDatabase();
            stmt = myConnection.createStatement();
            stmt.executeUpdate("insert into contacts values ('" + id + "', '" + contact + "', '" + contact_name + "')");
            return "Line with id = " + id + ", contact = " + contact + ", contact_name = " + contact_name + " was added";
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Problem with connection");
        } finally {
            stmt.close();
            myConnection.close();
        }
    }

    public static String putContact(String id, String contact, String contact_name) throws Exception {
        Connection myConnection = null;
        Statement stmt = null;
        String updtStmt = null;
        if (contact != null && contact_name != null) {
            updtStmt = "contact = '" + contact + "', contact_name = '" + contact_name + "'";
        } else if (contact != null) {
            updtStmt = "contact = '" + contact + "'";
        } else if (contact_name != null) {
            updtStmt = "contact_name = '" + contact_name + "'";
        }
        try {
            myConnection = ConnectToDB.initializeDatabase();
            stmt = myConnection.createStatement();
            stmt.executeUpdate("update contacts set " + updtStmt + "where id = " + id);
            return "Line with id = " + id + " was updated";
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Problem with connection");
        } finally {
            stmt.close();
            myConnection.close();
        }
    }
}
