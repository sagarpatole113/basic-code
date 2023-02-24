public class EvenSquare {
     static void cal_show()
     {   System.out.println("First 10 Even Numbers and their Squares");
         int num = 2;
         for (int i=1;i<=20;i++){
             if(i%2==0){
            System.out.println(i+" = "+num*i); 
         }
        }
     }
         public static void main(String[] args) {
         cal_show();
}
}
