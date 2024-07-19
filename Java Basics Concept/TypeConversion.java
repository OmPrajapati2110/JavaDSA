import java.util.*;
public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         float number = sc.nextInt(); //Float is having more bytes than int thats why int can store the value of flaot
        System.out.println(number); 

        /*  int number = sc.nextFloat(); //Int cannot store the value of float as it has less bytes than float and will throw an error
         System.out.println(number); */
    }
}
