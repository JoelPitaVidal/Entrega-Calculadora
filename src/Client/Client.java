package Client;

import Methods.ClientMethods;

import java.io.*;
import java.net.*;


public class Client {

    public static void main(String[] args) {

        int port = 6666;
        String [] operationData = new String [3];
        ClientMethods clientMethods = new ClientMethods();

        try(Socket socket = new Socket("localhost", port)){

            System.out.println("Connection established with the server");


            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            output.writeObject(operationData);

            String [] recibedData = (String[]) input.readObject();


        }catch(IOException e){
            System.out.println("Error creating socket server");
        } catch (ClassNotFoundException e) {
            System.out.println("Oops, class not found");
        }

    }
}