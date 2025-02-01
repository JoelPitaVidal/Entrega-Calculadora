package Server;

import Methods.ServerMethods;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import Methods.ClientMethods;
import Methods.ServerMethods;

public class Server {
    /**
     * The main method serves as the entry point for the server application.
     * It initializes the server on a specified port, waits for client connections,
     * and processes incoming data to perform operations and send results back to the client.
     *     
     * The method performs the following steps:
     * 1. Initializes the server on port 6666.
     * 2. Waits for a client connection and accepts it.
     * 3. Sets up input and output streams for communication with the client.
     * 4. Reads an array of strings from the client.
     * 5. Processes the received data using ServerMethods to perform operations.
     * 6. Sends the result back to the client.
     *
     * Exceptions handled:
     * - IOException: If an I/O error occurs when creating the server socket or during communication.
     * - ClassNotFoundException: If the class of a serialized object cannot be found.
     */
    public static void main(String[] args) {

        int port = 6666;
        ServerMethods metodosServidor = new ServerMethods();
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server started, waiting for connections");
            Socket socket = serverSocket.accept();
            System.out.println("Connection received");

            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

            String [] dataReceived = (String [])input.readObject();

            String [] ShowDataReceived = metodosServidor.ShowResult (dataReceived, metodosServidor.MakeOperation(dataReceived));

            output.writeObject(ShowDataReceived);

        }catch(IOException e){
            System.out.println("Error creating socket server");
        } catch (ClassNotFoundException e) {
            System.out.println("Oops, class not found");
        }

    }
}