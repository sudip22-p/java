// programme to load JDBC Drivers
/*
 MySqlLoadDriver.java
 Copyright (c) HerongYang.com. All Rights Reserved.
 */
import java.sql.*;
import java.util.*;

public class MySqlLoadDriver {
    public static void main(String[] args) {
        // Connection con = null;
        try {
            System.out.println("Before loading SQLServerDriver:");
            listDrivers();

            // load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("After loading SQLServerDriver:");
            listDrivers();
        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        } 
    }

    private static void listDrivers() {
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()) {
            Driver driverClass = (Driver) driverList.nextElement();
            System.out.println("  " + driverClass.getClass().getName());
        }
    }
}
