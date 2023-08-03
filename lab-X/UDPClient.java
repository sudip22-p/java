import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();

            // Get user input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a message to send to the server: ");
            String message = reader.readLine();

            // Convert the message to bytes and create a DatagramPacket to send to the server
            byte[] sendData = message.getBytes();
            InetAddress serverAddress = InetAddress.getByName("localhost"); // Change to the server's IP if needed
            int serverPort = 1254; // Change to the server's port if needed
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

            // Send the packet to the server
            clientSocket.send(sendPacket);

            // Prepare a DatagramPacket to receive the acknowledgment from the server
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Receive the acknowledgment from the server
            clientSocket.receive(receivePacket);

            // Extract the acknowledgment data from the packet and print it
            String ackMessageFromServer = new String(receivePacket.getData()).trim();
            System.out.println("Received acknowledgment from server: " + ackMessageFromServer);

            // Close the socket
            clientSocket.close();

            System.out.println("Message sent to server successfully:)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
