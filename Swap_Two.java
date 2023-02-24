
public class Swap_Two {
     int number = 12;
    int num1;
    int num2;
    void spliter(){
        num1 = number%10; 
        number = number/10;
	num2 = number%10; 
        number = number/10;
}
    void show(){
        System.out.println("Given number is = 12 " );
        System.out.println("After exchanging digits = " +num1 +num2 ); 
    }
    public static void main(String[] args) {
      Swap_Two s = new Swap_Two();
      s.spliter();
      s.show();
    }
}