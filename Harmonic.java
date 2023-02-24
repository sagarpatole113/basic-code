import java.util.Scanner;
public class Harmonic {
static void harmonic(){
double temp = 0.0;
System.out.println("Enter any value");
Scanner input= new Scanner(System.in);
int i=input.nextInt();
for (double x=i; x>0; x-- ){
temp=temp+(double)1/x;
}System.out.println("Value of Harmonic series are "+temp);
}
public static void main(String[] args) {
harmonic ();
}
}

