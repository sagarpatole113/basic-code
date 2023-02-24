
public class Dist_Light {
    int lightspeed = 186000;
    int days = 365; 
    long seconds; 
    long distance;
    
    void calculation(){
    
    seconds = days * 24 * 60 * 60; 
    distance = lightspeed * seconds; 
    }
    void show(){
    System.out.print("In " + days +" days light will travel " + distance +" miles." );
    }

    
   public static void main(String args[]) {
            Dist_Light call = new Dist_Light();
            call.calculation();
            call.show();
}
}