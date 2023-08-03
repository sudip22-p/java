import java.io.*;
import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(1254); // Server listens on port 1254

            byte[] receiveData = new byte[1024];

            // Create a DatagramPacket to receive data from the client
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Receive the packet from the client
            System.out.println("Waiting for client connection...");
            serverSocket.receive(receivePacket);
            System.out.println("Client connected!");

            // Extract the data from the packet
            String messageFromClient = new String(receivePacket.getData()).trim();

            // Print the received message
            System.out.println("Received message from client: " + messageFromClient);

            // Prepare and send acknowledgment to the client
            String ackMessage = "Message received by the server.";
            byte[] sendData = ackMessage.getBytes();
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);

            // Send the acknowledgment packet to the client
            serverSocket.send(sendPacket);

            // Close the socket
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
