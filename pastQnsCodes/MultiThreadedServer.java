import java.io.*;
import java.net.*;

public class MultiThreadedServer {
    public static void main(String[] args) {
        int port = 1254;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started and listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                Thread thread = new Thread(() -> {
                    try {
                        DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
                        DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());

                        String receivedMessage = dis.readUTF();
                        System.out.println("Received from client " + clientSocket.getInetAddress() + ": " + receivedMessage);

                        String response = "Server response to " + clientSocket.getInetAddress() + ": " + receivedMessage;
                        dos.writeUTF(response);

                        dos.close();
                        dis.close();
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
