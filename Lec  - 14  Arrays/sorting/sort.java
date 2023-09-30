public class sort {
    // BUBBLE SORT
    public static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        } the lawyer things are the things are ttte
    } 
    // SELECTION SORT
    
    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // INSERTION SORT
    public static void inserion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = arr[curr];
        }
    }

    

    

    public static void main(String[] args) {
        int arr[] = { 5, 2, 4, 1, 3 };
        
    }
}
