
public class Star {
    static void pattern()
    { int a = 6;
        for (int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        pattern();
    }
}
