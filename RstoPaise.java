
public class RstoPaise {
    float paise;  
    int rupee = 2;
      void cal (){
        paise= rupee*100;  
      }    
       void show(){    
           System.out.println("Given Rupee is = "+rupee);
           System.out.println("After converting Rupee in Paise ="+paise);
}
       public static void main(String[] args) {
        RstoPaise call = new RstoPaise();
        call.cal();
        call.show();
    }
}
