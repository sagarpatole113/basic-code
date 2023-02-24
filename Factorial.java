
import java.util.Scanner;
public class Factorial {
    static void show(){
    int fact=1;  
        System.out.println("Enter a number to find Factorial : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){    
                fact=fact*i;    
             }    
        System.out.println("Factorial of "+n+" = "+fact);
    }
        public static void main(String[] args) {
        show();
    }   
}
