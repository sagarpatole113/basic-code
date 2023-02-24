
public class Avg_Of_Three {
    
    int a = 20, b = 20,c = 10;
    int sum;
    float avg; 
    
    void cal_avg(){
    sum = a+b+c;
    avg = sum/3;
     
    }
    void show(){
        System.out.println("Givin values A = "+a + " B = "+b +" C = "+ c);
        System.out.println("Average of Three values: " + avg);
    }
    public static void main(String[] args) {
     Avg_Of_Three last = new Avg_Of_Three();
     last.cal_avg();
     last.show();
    }
    
 
}
