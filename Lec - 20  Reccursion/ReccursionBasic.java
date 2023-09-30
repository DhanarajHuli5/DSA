
class ReccursionBasic {
    public static void main(String[] args) {
        System.out.println(friendsPair(5));
    }

    // BINARY STRING
    public static void printBinStrings(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        // kaam
        printBinStrings(n-1, 0, str+"0");

        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    
    // FRIENDS PAIRING PROBLEM
    public static int friendsPair(int n) {
        if (n == 1 || n == 2) { 
            return n;
        }

        // int fnm1 = friendsPair(n - 1);
        // int fnm2 = friendsPair(n - 2);
        // int pairWays = (n - 1) * fnm2;
        // int totWays = fnm1 + pairWays;

        return friendsPair(n-1) + ((n-1)*friendsPair(n-2));
    }

    // REMOVE DUPLICATES FROM STRING
    public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);

        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicate(str, index + 1, newStr, map);
        } else {
            // New character
            map[currChar - 'a'] = true;
            removeDuplicate(str, index + 1, newStr.append(currChar), map);
        }
    }

    // TINING PROBLEM
    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tiling(n - 1);
        int fnm2 = tiling(n - 2);
        return fnm1 + fnm2;
    }

    // PRINT X^N
    public static long powOfN(long x, long n) {
        if (n == 0) {
            return 1;
        }
        return x * powOfN(x, n - 1);
    }

    // X^N OPTIMEZED
    public static long opwOfNopt(long a, long n) {
        if (n == 0) {
            return 1;
        }
        long halfPow = opwOfNopt(a, n / 2);
        long halfPowSq = halfPow * halfPow;
        if (n % 2 != 0) {
            halfPowSq = halfPowSq * a;
        }
        return halfPowSq;
    }

    // LAST OCCURENCE OF ELEMENT IN ARRAY
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // FIRST OCCURENCE OF ELEMENT IN ARRAY
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length)
            return -1;
        if (arr[i] == key)
            return i;
        return firstOccurence(arr, key, i + 1);
    }

    // SORTED ARRAY
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }

    // INCREASING
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }

    // PRINT DECREASEING
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }

    // FACTORIAL OF N
    public static int factorialN(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorialN(n - 1);
        int fn = fnm1 * n;
        return fn;
    }

    // SUM OF FIRST N NUMBERS
    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = sumOfN(n - 1);
        int sn = fnm1 + n;
        return sn;
    }

    // Nth FIBONACCI NUMBER
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }
}
