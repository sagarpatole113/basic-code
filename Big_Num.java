
public class Big_Num {
int a = 30;
int b = 40;
int c = 50;
int big;
void logic(){
      big = a > b ? ( a > c ? a : c) : (b > c ? b : c);    
}
void show(){
        System.out.println("Values given A = 30, B = 40, C = 50");
        System.out.println("Biggest number is : "+ big);    
}
public static void main(String arg[]) {
    Big_Num cal = new Big_Num();
    cal.logic();
    cal.show();
}
}

