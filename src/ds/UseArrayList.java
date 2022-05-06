package ds;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(70);
        list.add(5);
        list.add(3);
        list.add(80);

        System.out.println("fetching data using for loop");
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("fetching data using for each loop");
        for(Integer data:list){
            System.out.println(data);
        }

    }
}
