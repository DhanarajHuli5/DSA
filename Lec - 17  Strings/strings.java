import java.util.Scanner;

public class strings {
    // CHAR AT
    public static void charAt(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.print("  ");
    }

    // PALINDROME
    public static boolean palindrome(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // shortest path to reach destination.
    public static int shortPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') { // NORTH
                x++;
            } else if (path.charAt(i) == 'S') { // SOUTH
                x--;
            } else if (path.charAt(i) == 'E') { // EAS
                y++;
            } else {
                y--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (int) Math.sqrt(X2 + Y2);
    }

    // SUB STRING
    public static void subString(String name) {
        System.out.println(name.substring(0, 8));
    }

    // compare
    public static void compare(String name, String name2) {
        if (name.equals(name2)) {
            System.out.println("they are same");
        }
    }

    // LARGEST STRING
    public static void largestString(String fruits[]) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

    // STRING BUILDER
    public static void stringBuilder() {
        StringBuilder sb = new StringBuilder(" ");
        for (char ch = 'a'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }

    // UPPER CASE
    public static void upperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            sb.append(str.charAt(i));

        }   
        System.out.println(sb);
    }
    // STRING COMPRESSION
    public static String compression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compression(str));
    }
}