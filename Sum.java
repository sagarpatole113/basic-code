
public class Sum {
  int i, sum;
 void cls(){
   for (i=1;i<=20;i++)
       sum=sum+i;
 }
 void show(){
     System.out.println("Sum of 20 numbers is = "+ sum);
}
    public static void main(String[] args) {
        Sum s = new Sum();
        s.cls();
        s.show();
    }
}