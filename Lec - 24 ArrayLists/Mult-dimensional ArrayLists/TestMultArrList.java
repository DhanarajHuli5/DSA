import java.util.*;
public class TestMultArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(i*1);
        }
        for(int i=1; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
