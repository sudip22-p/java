//programme to create a table within the database 'testdb' and use normal statement tom insert a record in the table.
import java.sql.*;
public class CreateTable {
    public static void main(String[]args){
    System.out.println("Creating table...........");
    try{
        Statement stmt;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/myJavaDB";
        Connection con = DriverManager.getConnection(url,"root","Paudelzone22@#!");
        System.out.println("URL: "+url);
        System.out.println("Connection: "+con);
        stmt = con.createStatement();
        stmt.executeUpdate("use myJavaDB");
        stmt.executeUpdate("create table account(acc_no int primary key,owner varchar(30) not null,acc_type varchar(30) , amount float)");
        System.out.println("Table Created successfully");
        System.out.println("adding data.......");
        stmt.executeUpdate("insert into account values(22,'KL Rahul','saving',12245660)");//Insert a row of data
        System.out.println("Data added successfully!!!");
        con.close();
    }
    catch(Exception e){
        e.printStackTrace();

    }
 }

}
