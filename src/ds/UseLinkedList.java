package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(90);
        list.add(80);
        Iterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
