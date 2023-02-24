
import java.util.Scanner;


public class Combinations {

    static void check() {
        int i, j, k, in;
        int arr[]=new int[3];
        System.out.println("Enter Three Numbers :");
        Scanner s = new Scanner(System.in);
        
        for(in = 0; in<3; in++){
            arr[in]=s.nextInt();
            System.out.println("Given input = "+arr[in]);
        }
            System.out.println("Combination of Given Three Numbers");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k] );
                    }

                }
            }
        }
    }
    public static void main(String[] args) {
         check();
    }
}
