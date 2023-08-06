import java.sql.*;
public class MetaDataAccessExample {
    public static void main (String args[]){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSetMetaData resultMD = null;
        ResultSet result = null;
        try{
            //Register JDBC driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Open a connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost/myJavaDB","root","Paudelzone22@#!");
            ps = conn.prepareStatement("select * from account");
            result = ps.executeQuery();
            resultMD=result.getMetaData();
            System.out.println("Table Name: "+resultMD.getTableName(1));        
            System.out.println("Total Column Count: "+resultMD.getColumnCount());        
            System.out.println("First Column Name: "+resultMD.getColumnName(1));        
            System.out.println("Second Column Name: "+resultMD.getColumnName(2));        
            System.out.println("First Column Type: "+resultMD.getColumnTypeName(1));        
            System.out.println("Second Column Type: "+resultMD.getColumnTypeName(2));        
            conn.close();
         }
         catch(Exception e){
            System.out.println(e);
         }
    } 
}
