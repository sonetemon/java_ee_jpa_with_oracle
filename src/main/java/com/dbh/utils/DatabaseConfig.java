package com.dbh.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import static com.dbh.utils.AppConstant.*;


public class DatabaseConfig {

    public static Connection getconnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("connected");
        } catch (Exception e) {
            System.out.println("Not connection");
        }
        return connection;
    }

    public static void main(String[] args) {
        DatabaseConfig.getconnection();
    }
}
