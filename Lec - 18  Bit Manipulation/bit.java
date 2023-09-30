import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countSetBits(32));
    }

    public static void oddoreven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static boolean powerOf(int n) {
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}