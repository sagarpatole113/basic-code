
public class PatternOne {

    public static void main(String[] args) {
        {
            int i, j, k, l ;

            for (i = 1; i <= 4; i++) {
                char ch = 'A';

                for (j = 1; j <= i; j++) {
                    System.out.print("  ");
                   
                          
                }

                for (k = 4; k >= i; k--) {
                    System.out.print(" "+ch);
                    ch++;
                }
                --ch;
//char ch='C'; 
                for (l = 3; l >= i; l--) {
                    --ch;

                    System.out.print(" "+ch);

                }
                System.out.println();

            }
        }

    }

}
