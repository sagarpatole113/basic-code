import java.util.Scanner;
public class IntSum {
static void intsum(){
int x,y=0;
for (x=100; x<=200; x++){
if (x%7==0){
System.out.println("Numbers divided by 7 "+x);
y=y+x;
}
}System.out.println("Sum of the numbers = " +y);
}
public static void main(String[] args) {
intsum ();
}
}    

