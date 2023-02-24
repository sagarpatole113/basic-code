
public class SquareCube  {

 void cal_square(){
   for(int i=1;i<=10;i++){
    System.out.println("Square of "+ i + " = "+ i*i);
   }    
}

 void cal_cube(){
   for(int i=1;i<=10;i++){
    System.out.println("Cube of "+ i + " = "+ i*i*i);
   } 
}
    public static void main(String[] args) {
     SquareCube call = new SquareCube();
     call.cal_square();
     System.out.println("");
     call.cal_cube();
    }

}
