
public class NumberDiv {
    int a = 3;
    int b = 5;
    int n = 20;
    void condition1(){
        
        if (n % 3 == 0)
            System.out.println("Given number = "+n+" is divisable by "+a);
        else
            System.out.println("Given number = "+n+" is not divisable by "+a);
    }
    void condition2(){
        if (n % 5 == 0)
            System.out.println("Given number = "+n+" is divisable by "+b);
        else
            System.out.println("Given number = "+n+" is not divisable by "+b);
    }
    public static void main(String[] args) {
        NumberDiv p = new NumberDiv();
        p.condition1();
        p.condition2();
    }
    
    
}
