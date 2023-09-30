import javax.swing.text.html.HTMLDocument.RunElement;

public class over_loading_datatypes {

    // sum of 2 integers 
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum of 2 float/double
    public static double sum(Double a, Double b) {
        return a + b;
    }

    // sum of 3 int
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // sum of 3 float/double
    public static double sum(Double a, Double b, Double c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        // System.out.println(sum(3,5));
        // System.out.println(sum(2.5f,2.5f));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1.1, 1.1, 1.1));
        System.out.println(sum(1.1, 1.1));
    }
}
