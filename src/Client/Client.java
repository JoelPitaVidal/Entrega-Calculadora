package Client;

import Methods.ClientMethods;

import java.io.*;
import java.net.*;


public class Client {

    public static void main(String[] args) {

        int puerto = 6666;
        String [] datosOperar = new String [3];
        ClientMethods methodsOfClient = new ClientMethods();

        try(Socket socket = new Socket("localhost", puerto)){

            System.out.println("Conexion establecida con el servidor");


            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            output.writeObject(datosOperar);

            String [] dataReceived = (String[]) input.readObject();


        }catch(IOException e){
            System.out.println("Ups, error al conectarse al socket del servidor");
        } catch (ClassNotFoundException e) {
            System.out.println("Ups, clase no encontrada");
        }

    }
}