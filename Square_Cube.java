public class Square_Cube {
int a = 5;
int sq;
int cb;

 void cal_square(){
   sq =a * a;
   
}
 void cal_cube(){
   cb = a * a * a;
   
}

 void show(){
    System.out.println("Given Number is = "+a);
    System.out.println("Sqaure of 5 = " + sq);
    System.out.println("Cube of 5 = "+ cb);
   
}

    public static void main(String[] args) {
      //object creation
     Square_Cube call = new Square_Cube();
      //object calling
     call.cal_square();
     call.cal_cube();
     call.show();
    }

}
