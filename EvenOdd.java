
public class EvenOdd {

   public void condition(int x,int y){
       int a = x;
       int b = y;
        if(b % 2 == 0)
            System.out.println("Number is Even"); 
        else
            System.out.println("Number is Odd");
     }
    public static void main(String[] args) {
        EvenOdd s = new EvenOdd();
        s.condition(2, 7);
    }

}
