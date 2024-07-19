import java.util.*;

public class TotalBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float pen = sc.nextFloat();
        float total = eraser + pencil + pen;
        System.out.println(total); //Leave the GST Part
    }
}
