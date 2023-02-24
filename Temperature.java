
public class Temperature {
    float  celsius;  
    float fahrenheit = 78;
      void cal (){
           
         celsius  = ((fahrenheit-32)*5)/9; 
      }    
       void show(){    
           System.out.println("Given Temperature in Fahreheint = "+fahrenheit);
           System.out.println("After converting Temprature in Celsius ="+celsius);
}
       public static void main(String[] args) {
        Temperature call = new Temperature();
        call.cal();
        call.show();
    }
          
}