
public class Season {
    void condition(){
   String month = "January";  
    switch(month){  
    case "February": 
    case "March":
    case "April":
    case "May": 
    System.out.println("Entered month comes under Summer");  
    break;  
    case "June":
    case "July":
    case "August":
    case "September":
    System.out.println("Entered month comes under is Monsoon");  
    break;  
   
    case "October":
    case "November":
    case "December":
    case "January":
    System.out.println("Entered month comes under is Winter");  
    break;  
    default:System.out.println("invalid input");  
    }
             
    }
    public static void main(String[] args) {
        Season s = new Season();
        s.condition();
    }
}