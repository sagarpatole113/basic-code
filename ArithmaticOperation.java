
public class ArithmaticOperation {
    
     int a = 15;
     int b = 3;
     int c;
    
    void operation(){
      String choice = "Addition";
      switch(choice){
       case "Addition":
       c = a + b;
       System.out.println("Addition of given number is = " +c);
       break;
       
       case "Subtraction":
       c = a - b;
       System.out.println("Subtraction of given number is = " +c);
       break;
       
       case "Multiplication":
       c = a*b;
       System.out.println("Multiplication of given number is = " +c);
       break;
       
       case "Division":
       c = a/b;
       System.out.println("Division of given number is = " +c);       
       break;
      }
    }
    public static void main(String[] args) {
      ArithmaticOperation a = new ArithmaticOperation();
      a.operation();
    }
}
