import java.util.Scanner;

public class array_lec_questions {
    // LINEAR SEARCH
    public static int linear(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // LARGEST/smallest NUMBER
    public static int largest(int numbers[]) {
        int sml = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < sml) {
                sml = numbers[i];
            }
        }
        return sml;
    }

    // BINARY SEARCH
    public static int binary(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            }

        }
        return -1;
    }

    // reverse an array
    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp;
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    // - - - -PAIRS IN ARRAY- - - -
    public static void pairs(int arr[]) {
        // first number of a pair
        for (int i = 0; i < arr.length; i++) {
            int crr = arr[i];
            // second num of a pair
            for (int j = i + 1; j <= arr.length - 1; j++) {
                System.out.print("(" + crr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    
    // SUBARRAYS
    public static void subarrays(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                System.out.println(" : sum is " + sum);
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max value is " + maxSum);
    }

    // RAIN WATER TRAP
    public static void trapRainWater(int height[]) {
        int n = height.length;
        int trappedWater = 0;
        int leftMax[] = new int[n];
        // loop for leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        int rightMax[] = new int[n];
        // loop for rightMax array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop for water level and trapped water
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        System.out.println(trappedWater);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height[] = { 1,2,3,4,5 };
        pairs(height);

    }
}
