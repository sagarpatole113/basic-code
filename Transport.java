
import java.util.Scanner;

public class Transport {
    
    void choice(){
        Transport t = new Transport();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter choice for traveling options");
        System.out.println("For destination enter 1");
        System.out.println("For source to destination enter 2");
        System.out.println("For source via destination enter 3");
       
        int choice = s.nextInt();
        
         switch (choice){
            case 1:
                System.out.println("Enter destination city");
                String source = s.next();
                t.travel(source);
                System.out.println("Person is travelling to "+source);
                break;
            case 2:
                System.out.println("Enter source city");
                source=s.next();
                System.out.println("Enter destination city");
                String destination = s.next();
                t.travel(source, destination);
                System.out.println("Person is travelling from "+source+" to "+destination);
                break;
            case 3:
                System.out.println("Enter source city");
                source=s.next();
                System.out.println("Enter destination city");
                destination=s.next();
                System.out.println("via city");
                String via =s.next();
                t.travel(source, destination, via);
                System.out.println("Person is travelling from "+source+" to "+destination+" via "+via);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
   
    void travel(String destination){
                
    }
    void travel(String source, String destination){
        
    }
    void travel(String source, String destination, String via){
        
    }
            
    public static void main(String[] args) {
         Transport tr = new Transport();
         tr.choice();
    }
}
