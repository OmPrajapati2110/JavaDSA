//The user will input the number and we have to use Whil Loop to print from 0 to that number
import java.util.*;

public class UserInputNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 1;
        while (counter <= num) {
            System.out.println("The numbers printed after the input by user " + counter);
            counter++;
        }
    }
}
