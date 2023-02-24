
import java.util.Random;
import java.util.Scanner;


public class GuessNumber {

     void guessMethod(){
        int a = 6;
   
        int i, guess,number;
        
        final int MAX = 50;
        
        Random rand = new Random();
  
        boolean correct = false;
        
        number = rand.nextInt(MAX) + 1;
        
        System.out.println("Number is chosen by system between 1-50.");
        System.out.println("Guess the number in five attempt to win the game");         
        Scanner sc = new Scanner(System.in);
        
        for (i=1;i<a;i++) {
 
            System.out.println("Attempt: "+i);
 
            guess = sc.nextInt();
 
            if (number == guess) {
                System.out.println("You guessed the number. You win!!!!!");
                correct = true;
                break;
            }   
         
            else if(number>guess){
                System.out.println("Number is Greater than " + guess);
            
            }       
        
            else if(number<guess){
                System.out.println("Number is Lesser than " +guess);
            }
           
    }
        if (i==a){
                System.out.println("Your 5 Attempts are over!");
            }
        
                System.out.println("The number was :"+ number);
       
 }
    public static void main(String[] args) {
        GuessNumber gn = new GuessNumber();
        gn.guessMethod();
    }
}