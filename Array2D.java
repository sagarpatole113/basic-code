import java.util.Scanner;
public class Array2D {
   static int i=0; static int j=0; static int sum =0;
   static int k =0;static int l=0;
   static void twodarr(){
       Scanner s = new Scanner(System.in);
       int arr[][] = new int[3][3];
       System.out.println("Enter Numbers into array :");
       for(  i = 0;i<3;i++){
           for( j = 0;j<3;j++){
               arr[i][j]=s.nextInt();
           }
       }
       
       System.out.println("Entered array elements :");
       for ( i=0; i<3;i++){
           for ( j=0;j<3;j++){
               System.out.print(arr[i][j]);
           }
           System.out.println(" ");
        }
   for (int i=0;i<arr.length;i++){
       for (int j=0;j<arr.length;j++){
           sum=sum+arr[i][j];
       }
   }
    System.out.print("sum of given elements: "+sum);
   }
    public static void main(String[] args) {
        twodarr();    
    }
}
    

