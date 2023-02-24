
import java.util.Scanner;


public class AvgOfFiveSub {
  static void input(){
              double temp=0;
        Scanner sc=new Scanner(System.in);
        int arr[][]= new int [4][4];
       
        
        for (int i=0; i<4; i++){
            System.out.println("Enter marks of English,Science,Math & Hindi for student " +(i+1));
            for (int j=0; j<4; j++)
                arr[i][j]=sc.nextInt();   
        }
      
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
               
                temp=temp+arr[j][i];                
            }
            System.out.println(" The average marks of subject " +(i+1) +" for all students are " +(temp/4.0));
            temp=0;
        }
    }
    

    public static void main(String[] args) {
         input();
    }
 
}
