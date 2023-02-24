
import java.util.Scanner;

public class Ascii {

    static void check() {
        char ch;
        System.out.println("Enter a character : ");
        Scanner s = new Scanner(System.in);
        ch = s.next().charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.print("You entered Upper case Character");
        } else if (ch >= 97 && ch <= 122) {
            System.out.print("You entered Lower case Character");
        } else if (ch >= 48 && ch <= 57) {
            System.out.print("You entered a Number");
        } else {
            System.out.print("You entered a Symbol");
        }
    }

    public static void main(String[] args) {
        check();
    }
}
