package cart;

import java.util.LinkedList;
import java.util.List;

public class DataStructure {
    public static void main(String[] args) {
        System.out.println("Data Structure");
        List<Integer> intList = new LinkedList<Integer>();

        intList.add(Integer.parseInt("12"));
        intList.add(10);
        intList.add(20);
        intList.add(0, 56);
        System.out.println(intList);

        for (int i=0; i<intList.size(); i++){
            System.out.println("idx: "+ i);
            System.out.println("Val: "+ intList.get(i));
        }
    }

    

}