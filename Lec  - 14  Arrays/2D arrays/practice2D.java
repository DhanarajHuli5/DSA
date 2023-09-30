public class practice2D {
    public static int findNumTimes(int matrix[][]){
        int count=0;
        for(int i = 0; i< matrix.length;i++){
            for(int j = 0; j< matrix[0].length;j++){
                if(matrix[i][j] == 10){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,10,48},
            {10,33,39,10}
        };
        System.out.println(findNumTimes(matrix));
    }
}
