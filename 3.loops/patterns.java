public class patterns {
    public static void num(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // 0101010
    public static void zero(int n) {
        for (int i = 1; i <= n; i++) {                          
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { // even
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    // BUTTERFLY PATTERN
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // inner loop for space
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // inner loop for start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for (int i = n; i >= 1; i--) {
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // inner loop for space
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // inner loop for start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // inner for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner for star
            for (int j = 1; j <= n; j++) {
                if ((i + j) >= 6) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // diamond
    public static void diamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        diamond(4);
    }

}