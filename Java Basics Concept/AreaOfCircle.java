import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi =  3.14f; //If mentioning float on the left then write f on the right after the number or mention double on the left
        float radius  = sc.nextFloat();
        double area = pi * (radius * radius);
        System.out.println(area);
    }
}
