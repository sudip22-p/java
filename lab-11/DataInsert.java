//programme to use prepared statement to insert a record in the table.
import java.sql.*;
public class DataInsert {
    public static void main(String[]args){
        try{
            System.out.println("adding data................");
            //create a mysql database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/myJavaDB","root", "Paudelzone22@#!");
             
            //The mysql insert statement
            String query = "insert into account(acc_no, owner, acc_type, amount) values(?, ?, ?, ?)";

            //create the mysql insert preparedStatement
            PreparedStatement prepStmt = conn.prepareStatement(query);
            prepStmt.setInt(1, 44);
            prepStmt.setString(2, "Rohit Paudel");
            prepStmt.setString(3, "Current");
            prepStmt.setInt(4, 1276800);

            //Execute the preparedStatement
            prepStmt.execute();
            System.out.println("data added -mission success!!");
            conn.close();
        }
        catch(Exception e){
            System.err.println("Exception!!! "+ e.getMessage());
        }
    }
    
}
