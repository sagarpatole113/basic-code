
import java.util.Scanner;


public class TransportTwo {
    static void travel(String destination){
        System.out.println("Person is travelling to "+destination);
    }
    static void travel(String source, String destination){
        System.out.println("Person is travelling from "+source+" to "+destination);      
    }
    static void travel(String source, String destination , String via){
        System.out.println("Person is travelling from "+source+" to "+destination+" via "+via
        );
    }

    public static void main(String[] args) {
        TransportTwo t =new TransportTwo();
        Scanner s = new Scanner(System.in);
        String input = new String("na");
        System.out.println("Enter source city");
        String sour = s.next();
        System.out.println("Enter via city");
        String via = s.next();
        System.out.println("Enter destination city");
        String dest = s.next();
        
        if(sour.equals(input) && via.equals(input)){
            travel(dest);
        }
        else if(dest.equals(dest)&& sour.equals(sour) && via.equalsIgnoreCase(input)){
            travel(sour, dest);
        }
        else if(!dest.equals(input)&&!sour.equals(input)&&!via.equals(input)){
            travel(sour, dest, via);
      }
        if(dest.equals(input) && sour.equals(input) && via.equals(input)){
          System.out.println("Sorry no booking in made");
    }
    } 
   
    }


