
import java.util.Scanner;

public class Prime {
static void prime(){
System.out.println("Enter number to check Prime number");
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int count=0;
for (int i=2; i<a; i++)
{
if (a%i==0)
count++;
}
if (count!=0)
{
System.out.println("Number "+a+" is not prime number");
}
else
System.out.println("Number "+a+" is prime number");
}
public static void main(String[] args) {
prime ();
}
}    
