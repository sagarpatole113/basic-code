public class Area {
    int radius = 5;
    double pi = 3.14, area;
    
    void calculation(){
      area = pi * radius * radius;
    }
    void show(){
        System.out.println("To calculate Area of circle given Radius is :"+ radius);
        System.out.println("After caluculation Area of circle is = "+area); 
    }

   public static void main(String args[]) {
            Area call = new Area();
            call.calculation();
            call.show();
}
}