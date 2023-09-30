/*
 * Operations on ArrayList
 * 1.add(1); -- o(1)
 * 1.2 add(1,5); o(n) -- adds value on prticular index
 * 2.get(index); -- o(1)    -- pirnt number at index
 * 3. remove(index); -- (n) -- delete index
 * 4. set(index,value); -- o(n)
 * 5. contain(12); --o(n)  -- checks whether the number exits in array list 
 * --> size of array list -> list.size();
 */



import java.util.ArrayList;
class OperationsOnArrayList{
    void printArrayList(ArrayList<Integer> list){
        for(int i=1; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    void Operations(ArrayList<Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.set(1, 10));
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        list.add(1,23);
        System.out.println(list);
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=1; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}