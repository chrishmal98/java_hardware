/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author Chrishmal Rodrigo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chrishmal Rodrigo
 */
public class DB {

    private static Connection connection;

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware", "root", "Password");

    }

    public static void iud(String iud) throws Exception {

        if (connection == null) {

            connect();
        }
        connection.createStatement().executeUpdate(iud);
    }

    public static ResultSet search(String sql) throws Exception {
        if (connection == null) {
            connect();
        }
        return connection.createStatement().executeQuery(sql);
    }

    public static Connection getNewConnection() throws Exception {
        if (connection == null) {
            connect();
        }
        return connection;

    }

}
