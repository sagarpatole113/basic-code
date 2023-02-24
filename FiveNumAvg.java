
import java.util.Scanner;


public class FiveNumAvg {
 static void average(){
     int in;
     int arr[]=new int[5];
     System.out.println("Enter Five Numbers :");
     Scanner s = new Scanner(System.in);
     for(in = 0; in<5; in++){
            arr[in]=s.nextInt();
        }
     
     float avg;
     int sum = 0;
     int len= arr.length;
     for (int i =0; i<arr.length;i++){
         System.out.println("Given Numbers :"+arr[i]);
         sum=sum+arr[i];
     }
     avg=sum/len;
     System.out.println("Average of given Five Numbers:"+avg);
 }
    public static void main(String[] args) {
         average();
    }
}
