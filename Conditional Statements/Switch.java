import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1 : System.out.println("Samosa");
                
                break;
            case 2 : System.out.println("Juice");
                
                break;
            
            default : System.out.println("Dreaming");
                
                break;
        }
    }    
}
