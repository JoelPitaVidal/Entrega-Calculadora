package Methods;

import java.util.Scanner;

public class ClientMethods {

    public void showResult(String [] result){
        System.out.println("The result is: " + result[3]);
    }


        public void makeOperation(String[] operacion){

        System.out.println("Enter the first number of the operation: ");
        Scanner sc = new Scanner(System.in);
        String number1 = sc.nextLine();

        System.out.println("Enter an operation:");
        String operator = sc.nextLine();

        System.out.println("Enter the second number of the operation:");
        String number2 = sc.nextLine();
    
        operacion[0] = number1;
        operacion[1] = operator;
        operacion[2] = number2;

    }
}
