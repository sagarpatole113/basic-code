import java.util.Scanner;
public class MatrixMulti {
    

    static void multi(){
        Scanner sc = new Scanner(System.in);
       int a[][] = new int[2][2];
       System.out.println("Enter Numbers in Matrix 1 :");
       for(int  i = 0;i<2;i++){
           for(int j = 0;j<2;j++){
               a[i][j]=sc.nextInt();
           }
       }
       int b[][] = new int[2][2];
       System.out.println("Enter Numbers in Matrix 2 :");
       for(int  i = 0;i<2;i++){
           for(int j = 0;j<2;j++){
               b[i][j]=sc.nextInt();
           }
       }
       
       System.out.println("Entered elements in Matrix 1 :");
       for (int i=0; i<2;i++){
           for (int j=0;j<2;j++){
               System.out.print(a[i][j]+"   ");
           }
           System.out.println();
        }
       System.out.println("Entered elements in Matrix 2 :");
       for (int i=0; i<2;i++){
           for (int j=0;j<2;j++){
               System.out.print(b[i][j]+"   ");
           }
           System.out.println();
        }
      int[][] mul = new int[2][2];
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mul[i][j] = a[i][j] * b[i][j];
            }
        } 
        System.out.println("Multiplication of the given matrices is: ");
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mul[i][j] + "   ");
            }
            System.out.println();
        }
      
    }
    public static void main(String[] args) {
         multi();
    }
}


