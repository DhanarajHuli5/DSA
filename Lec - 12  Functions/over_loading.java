import javax.swing.text.html.HTMLDocument.RunElement;

public class over_loading {
    // sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum of 3 numbers 
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]){
        System.out.println(sum(2,2));
        System.out.println(sum(2,2,2));
        
}
}