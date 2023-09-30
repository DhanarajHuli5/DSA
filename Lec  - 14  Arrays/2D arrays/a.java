import java.util.Scanner;
public class a {
    public static int search(int mat[][],int n,int m){
        int key = 7;  
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                if(key==mat[i][j]){
                    System.out.println("key found at"+(i+1)+","+(j+1));
                }
            }
        }
        return 0;
    }
    // largest elemetn in matrix
    public static int getMax(int mat[][],int n,int m){
        int lar=mat[0][0];
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]>lar){
                    lar=mat[i][j];
                }
            }
        }
        return lar;
    }
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        int n = mat.length, m= mat[0].length;
        Scanner sc = new Scanner(System.in);
        // enter elements for matrix 
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        // output matrix
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("largest element is "+getMax(mat, n, m));
    }
}