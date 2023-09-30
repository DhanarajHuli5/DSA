
import java.util.Scanner;

public class fun {
    public static int bcoff(int n, int r){
      int nfact = fact(n);
      int rfact = fact(r);
      int mnrfact = fact(n-r);
      int biocoff = nfact / (rfact*mnrfact);
      return biocoff;
    }
    public static int fact(int n){
      int f=1;
      for(int i=1;i<=n;i++){
        f=f*i;
      }
      return f;
    }
    public static void main(String[] args) {
      int n = 5;
      int r = 2;
      int print = bcoff(n, r);
      System.out.println(print);
    }
}