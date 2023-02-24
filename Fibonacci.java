import java.util.Scanner;
public class Fibonacci {
    
static void fibonacci(){
int a, b=0, c=1, d;
System.out.println("Enter any number to display series ");
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
for (int i=1; i<=a; i++){
System.out.print(b +" ");
d=b+c;
b=c;
c=d;
}
}
public static void main(String[] args) {
fibonacci ();
}
}

