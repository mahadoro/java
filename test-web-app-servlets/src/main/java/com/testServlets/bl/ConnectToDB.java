package com.testServlets.bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
    public static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException {
        String dbDriver = "oracle.jdbc.driver.OracleDriver";
        String dbURL = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String dbUsername = "diplom";
        String dbPassword = "orapassword";

        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        return con;
    }
}

