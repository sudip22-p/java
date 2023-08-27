import java.sql.*;
import java.io.BufferedReader;
import java.io.*;
public class EmployeeCountByName {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/pu";  // Replace with your database URL
        String username = "your-username";         // Replace with your database username
        String password = "your-password";         // Replace with your database password

        // Prompt user to enter a name
        String name = getUserInput("Enter a name: ");

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create the SQL query
            String sql = "SELECT COUNT(*) FROM Employee WHERE name = ?";

            // Prepare the statement
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);

            // Execute the query
            ResultSet resultSet = statement.executeQuery();

            // Process the result
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                System.out.println("Total number of employees with name " + name + ": " + count);
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method to get user input
    private static String getUserInput(String message) {
        String input = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(message);
            input = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return input;
    }
}
