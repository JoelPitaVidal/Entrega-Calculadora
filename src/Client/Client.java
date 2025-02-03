package Client;

import Methods.ClientMethods;

import java.io.*;
import java.net.*;


public class Client {

    public static void main(String[] args) {

<<<<<<< HEAD
        int puerto = 6666;
        String [] datosOperar = new String [3];
        ClientMethods methodsOfClient = new ClientMethods();
=======
        int port = 6666;
        String [] operationData = new String [3];
        ClientMethods clientMethods = new ClientMethods();
>>>>>>> d3216bf165c988a238a6acb1c2e7c165c95e761a

        try(Socket socket = new Socket("localhost", port)){

            System.out.println("Connection established with the server");


            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            output.writeObject(operationData);

<<<<<<< HEAD
            String [] dataReceived = (String[]) input.readObject();
=======
            String [] recibedData = (String[]) input.readObject();
>>>>>>> d3216bf165c988a238a6acb1c2e7c165c95e761a


        }catch(IOException e){
            System.out.println("Error creating socket server");
        } catch (ClassNotFoundException e) {
            System.out.println("Oops, class not found");
        }

    }
}