import java.util.*;
public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= nums) {
            sum = sum + counter;
            counter++;
        }
        System.out.println(sum);

    }
}
