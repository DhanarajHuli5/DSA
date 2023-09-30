import java.util.ArrayList;
import java.util.Collections;
public class ALQuestions {
    public static void swap(ArrayList<Integer> list, int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        int max = 0;
        // for(int i=0; i<list.size();i++){
        //     max = Math.max(max,list.get(i));
        // }
        // System.out.println(max);

            int idx1 = 1, idx2 = 2;
            Collections.sort(list);
            System.out.println(list);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list );
            
    }
}
