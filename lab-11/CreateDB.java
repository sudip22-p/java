//Programme to create a database named 'myJavaDB'
import java.sql.*;
public class CreateDB {
    public static void main(String args[]){
        System.out.println("Connecting to sql.......");
        try{
            Statement stmt;
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the MySQL database
            String url = "jdbc:mysql://localhost:3306/javaTestDB";
            String username = "root";
            String password = "Paudelzone22@#!";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected......");
            // String url = "jdbc.mysql://localhost:3306/existing_DB";

            // Connection con = DriverManager.getConnection(url,"root","Paudelzone22@#!");
            System.out.println("URL: "+url);
            System.out.println("Connection: "+con);
            System.out.println("Creating DB......");
            stmt = con.createStatement();
            stmt.executeUpdate("CREATE DATABASE myJavaDB");
            System.out.println("myJavaDB created successfully");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
