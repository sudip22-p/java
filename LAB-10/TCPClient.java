import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 1253); // Connect to server on port 1254

            // Get user input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a message to send to the server: ");
            String message = reader.readLine();

            // Send the message to the server
            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter out = new PrintWriter(outputStream, true);
            out.println(message);

            // Receive the acknowledgment from the server
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            String ackMessageFromServer = in.readLine();
            System.out.println("Received acknowledgment from server: " + ackMessageFromServer);

            // Close the socket
            clientSocket.close();

            System.out.println("Message sent to server successfully:)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
