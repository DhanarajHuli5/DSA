import java.util.*;

public class Questions2{
    // container with max water -->  BRUE FORCE - 0(N^2)
    public static int storeWater(ArrayList<Integer> height){
        // hi !
        // this the code of the problem of water containing
        //ohh
        //run it 

        // find pairs
        // find current water storage in every pair -> currWater = height   * width ;
        //                                                     min((i),(j))    j-i
        //compare currWater with maxWater 

        int maxWater =0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int wd = j-i;
                int currWater = ht * wd;
                maxWater = Math.max(currWater,maxWater);
            }
        }
        return maxWater;
    }
    // container with max water --> Opetimized --> TWO POINTERS APPROACH - 0(N) - Linear time
    public static int storeWaterOpt(ArrayList<Integer> height){
        // run while loop till leftPointer < rightPointer
        // find currWater level and compare with maxWater  --> height * width;
        // then update left and right pointers
        // (LP < RP ) ? LP++ : RP-- ;

        int maxWater=0;
        int LP = 0;
        int RP = height.size()-1;

        while(LP<RP){
            // water area
            int ht = Math.min(height.get(LP), height.get(RP));
            int width = RP - LP;
            int currWater = ht * width;
            maxWater = Math.max(currWater,maxWater); 

            if(LP<RP){
                LP++;
            } else{
                RP--;
            }
            
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWaterOpt(height));
        
        // wait
        int a = 10;
        int b = 20;
        System.out.println(a+b);
 
    }
}