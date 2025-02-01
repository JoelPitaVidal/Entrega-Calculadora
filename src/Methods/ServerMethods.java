package Methods;

public class ServerMethods {

    public String [] ShowResult (String [] operation, int result){
        String resultString = String.valueOf(result);
        return new String[]{operation[0],operation[1],operation[2], resultString};
    }

    public int MakeOperation(String [] operation){

        String operador = operation[1];
        int resultado = 0;
        switch (operador){
            case "+":
                resultado = addition(operation);
                break;
            case "-":
                resultado = subtraction(operation);
                break;
            case "*":
                resultado = multiplication(operation);
                break;
            case "/":
                resultado = division(operation);
                break;
        }
        return resultado;
    }
    public int addition(String[] operation) {
        String number1 = operation[0];
        String number2 = operation[2];

        return Integer.parseInt(number1) + Integer.parseInt(number2);
    }

    public int subtraction(String[] operation) {
        String number1 = operation[0];
        String number2 = operation[2];

        return Integer.parseInt(number1) - Integer.parseInt(number2);
    }

    public int multiplication(String[] operation) {
        String number1 = operation[0];
        String number2 = operation[2];

        return Integer.parseInt(number1) * Integer.parseInt(number2);
    }

    public int  division(String[] operation) {
        String number1 = operation[0];
        String number2 = operation[2];

        try{
            return Integer.parseInt(number1) / Integer.parseInt(number2);
        }catch(ArithmeticException e){
            System.out.println("Sorry, it is not possible to divide by zero");
            return 0;
        }
    }
}
