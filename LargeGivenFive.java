
public class LargeGivenFive {

    static int a = 1, b = 15, c = 4, d = 19, e = 12;

    static void check() {  
        if (a > b && a > c && a > d && a > e) {
            System.out.println("A is Greater = "+a);
        } else if (b > c && b > d && b > e) {
            System.out.println("B is Greater = "+b);
        } else if (c > d && c > e) {
            System.out.println("C is Greater = "+c);
        } else if (d > e) {
            System.out.println("D is Greater = "+d);
        } else {
            System.out.println("E is Greater = "+e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Given values are A = 1, B = 15, C = 4, D = 19, E = 12");
        check();
    }
}
