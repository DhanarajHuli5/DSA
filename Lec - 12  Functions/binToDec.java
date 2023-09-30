import java.util.Scanner;
public class binToDec {
    public static void binToDec(int n) {
        int deci=0;
        int pow = 0; 
        int orgn=n;
        while(n!=0){
            int lastdig= n%10;
            deci = deci + (lastdig * (int) Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println("decimal of "+orgn+"is "+deci);
    }
 public static void main(String args[]){
    binToDec(1111);
    }
}
