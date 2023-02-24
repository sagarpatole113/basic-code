
public class Sphere {
    int radius=20;  
    double pie=3.14;  
    double volume=20;
    void cal(){  
    volume = (4.0/3.0)*pie*(radius*radius*radius);
    }       
    void show(){
    System.out.println("Volume of the sphere="+volume);  
    }
    public static void main(String args[])  
    {  
     Sphere call = new Sphere();
     call.cal();
     call.show();
    }  
     
}
