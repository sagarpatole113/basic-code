
public class Simple_Interest {
float principle = 15000;
float rate = 12;
float time = 2;
float sim_int;

void cal(){
   sim_int = (principle*rate*time)/100;
}
void show(){
    System.out.println("Given Principle Amount = " +principle);
    System.out.println("Given Rate is = " +rate);
    System.out.println("Given Time is = " +time);
    System.out.println("Simple Interest = " +sim_int);
    }

    public static void main(String[] args) {
        Simple_Interest display = new Simple_Interest();
        display.cal();
        display.show();
    }

    
}
