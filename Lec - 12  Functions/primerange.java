import javax.swing.plaf.TreeUI;

public class primerange{
    // Number is prime or not
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        } 
        return true;
    }
    // calling prime function and printing if true
    public static void primeRange(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        return;
        
    }
        public static void main(String  args[]){
        primeRange(10);
    }
}
