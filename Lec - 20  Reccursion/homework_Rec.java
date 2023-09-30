public class homework_Rec {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    // RETURN INDEX OF KEY IN AN ARRAY
    public static void returnIndex(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i);
        }
        returnIndex(arr, key, i + 1);
    }

    // NUMBER TO STRING
    public static void numToString(int n) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        System.out.print(digits[lastDigit] + " ");
        numToString(n / 10);
    }

    // STRING SIZE
    public static int stringSize(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(stringSize("dhanaraj"));
    }
}
