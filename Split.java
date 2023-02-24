
public class Split {
    int number = 2022;
    int num1;
    int num2;
   int num3;
    void spliter(){
        num1 = number%10; 
        number = number/10;
	num2 = number%10; 
        number = number/10;
        num3 = number%10;
        number = number/10;
    }
    void show(){
        System.out.println("Given Number is = 2022");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(number);
    }
     public static void main(String[] args) {
         Split display = new Split();
         display.spliter();
         display.show();
    }   
}
