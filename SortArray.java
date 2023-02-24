
import java.util.Scanner;


public class SortArray {
    static void sort(){
     
    int arr[] = new int [5];     
        int temp = 0;   
        Scanner s =new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");    
        for (int i = 0; i < arr.length; i++) {     
             arr [i]=s.nextInt();
        }         
        System.out.println("Given elements :");
        for (int i = 0; i < arr.length; i++) {     
             System.out.print(arr[i]);
        } 
        
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }   
    public static void main(String[] args) {
         sort();
    }
}
        