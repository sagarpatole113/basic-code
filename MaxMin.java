
public class MaxMin {
   int num1 = 100;
   int num2 = 200;
   int num3 = 50;
   int max;
   int min1;
   int min2;
   void condition(){
        if((num1 > num2) && (num1 > num3))
    {
        max = num1;
        min1 = num2;
        min2 = num3;
    }
    else if((num2 > num1) && (num2 > num3))
    {
        max = num2;
        min1 = num1;
        min2 = num3;
    }
    else if((num3 > num1) && (num3 > num2))
    {
        max = num3;
        min1 = num1;
        min2 = num2;
    }
   }    
        void print()
        {
       System.out.println("Given Numbers are Num1 = "+num1+ " Num2 = "+num2+" Num3 = "+num3);
       System.out.println("Maximum Number is = " + max);
       System.out.println("Minimum Numbers are = " + min1 +" and "+min2);
   }
        public static void main(String[] args) {
        MaxMin s = new MaxMin();
        s.condition();
        s.print();
    }
   }        

       