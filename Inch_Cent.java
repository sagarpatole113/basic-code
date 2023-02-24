
public class Inch_Cent {
int inch = 20;
double cent;

void convert(){
   cent= 2.54 * inch;
}
void show(){
    System.out.println("Length in Inches = "+inch);
    System.out.println("After converting");
    System.out.println("Length in Centimeter = "+cent);
    
}
    public static void main(String[] args) {
     Inch_Cent dis = new Inch_Cent();
     dis.convert();
     dis.show();
    }
    
}
