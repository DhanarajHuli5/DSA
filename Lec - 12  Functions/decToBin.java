import java.util.Scanner;

public class decToBin {
    public static int decitobin(int n) {
        int binNum = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        return binNum;
    }

    

    public static void sumOfDig(int x){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {                                         
            int ld = num % 10;
            sum = sum + ld;
            num = num /10;
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        int a = 10;
        int b= a++;
        System.out.println(b);
        System.out.println(a);
    }
}
