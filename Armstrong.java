
import java.util.Scanner;

public class Armstrong {

    static void armstrong() {
        int y, z, w, v;
        System.out.println("Enter any number to check if its Armstrong Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        y = (x / 100);
        z = (x % 100) / 10;
        w = (x % 10);
        v = (y * y * y) + (z * z * z) + (w * w * w);
        if (x == v) {
            System.out.println("The entered number " + x + " is Armstrong");
        } else {
            System.out.println("The entered number " + x + " is not Armstrong");
        }
    }

    public static void main(String[] args) {
        armstrong();
    }
}
