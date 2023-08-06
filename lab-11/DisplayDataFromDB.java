import java.sql.*;
public class DisplayDataFromDB {
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP2:Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //STEP3: Open a Connection
            System.out.println("Connecting to database..........");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/myJavaDB","root","Paudelzone22@#!");
            System.out.println("DB connected!!");
            //STEP4: Execute a query
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT acc_no, owner, acc_type, amount FROM account");
            //STEP5:Exract data from result set
            System.out.println("**Data in table are:");
            while(rs.next()){

                //retrieving and Display values
                System.out.println("accNo: "+rs.getInt("acc_no") +" amount: "+rs.getInt("amount") + " owner: "+rs.getString("owner")+" accType: "+rs.getString("acc_type"));
                
            }
            //STEP6:Claen up environment
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
        finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                stmt.close();
                if(conn!=null)
                conn.close();
            }catch(Exception se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("All Done!! -Good Bye!");
    }//end main    
}//end FirstExample
