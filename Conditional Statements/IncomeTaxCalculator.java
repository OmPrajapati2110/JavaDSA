import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        // double tax = sc.nextDouble();

        if(income < 500000){
            System.out.println("The tax will be " + income * 0);
        }
        else if (income >= 500000 && income <= 1000000 ) {
            System.out.println("The tax will be " + income * 0.2);
        }
        else{
            System.out.println("The tax will be " + income * 0.3);
        }
    }
}
