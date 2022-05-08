package ds;

import java.util.*;

public class UseMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("USA","New York");
        map.put("Canada","Ontario");
        map.put("Australia", "Sydney");

        for(Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

        Set<String> set = new HashSet<String>();
        set.add("Mango");
        set.add("Banana");
        set.add("Mango");

        for(String data:set){
            System.out.println(data);
        }
    }
}
