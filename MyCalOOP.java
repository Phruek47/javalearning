import java.util.Scanner;

public class MyCalOOP {
    public static void main( String[] args ) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter an integer1");
        int firstNum = keyboard.nextInt();

        System.out.println("enter an operator");
        String operator = keyboard.next();

        System.out.println("enter an integer2");
        int secondNum = keyboard.nextInt();

        CalculatorOOP Cal = new CalculatorOOP();

        if (new String(operator).equals("+") == true) {
            Cal.Add(firstNum,secondNum);
        }
        else if (new String(operator).equals("-") == true) {
            Cal.Sub(firstNum,secondNum);
        }
        else if (new String(operator).equals("*") == true || new String(operator).equals("x") == true) {
            Cal.Mul(firstNum,secondNum);
        }
        else if (new String(operator).equals("/") == true) {
            Cal.Div(firstNum,secondNum);
        }
        else {
             System.out.println("Operation Error.");
        }




    }
}