import java.util.*;

public class CalCusingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println("The sum of a and b " + (a + b));
                
                break;

            case '-': System.out.println("The sum of a and b " + (a - b));
                
                break;

            case '*': System.out.println("The sum of a and b " + (a + b));
                
                break;

            case '/': System.out.println("The sum of a and b " + (a + b));
                
                break;

            case '%': System.out.println("The sum of a and b " + (a + b));
                
                break;

            default: System.out.println("You are inputiing wrong symbol");
                
                break;
        }
    }
}
