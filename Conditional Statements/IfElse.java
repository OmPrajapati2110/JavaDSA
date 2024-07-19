import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // int age = 15;
        if(age >= 18){
            System.out.println("Person is an adult");
        }
        else{
            System.out.println("Person is not an adult");
        }
    }    
}
