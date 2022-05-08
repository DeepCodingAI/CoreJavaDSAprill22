package ds;

import java.util.*;

public class UseMapWithList {
    public static void main(String[] args) {
        Map<String, List<String>> map = new Hashtable<String,List<String>>();

        List<String> cityOfUSA = new ArrayList<>();
        cityOfUSA.add("New York");
        cityOfUSA.add("New Jersey");
        cityOfUSA.add("Florida");
        cityOfUSA.add("California");

        List<String> cityOfCanada = new ArrayList<>();
        cityOfCanada.add("Alberta");
        cityOfCanada.add("Ontario");
        cityOfCanada.add("Nova Scotia");
        cityOfCanada.add("Montreal");

        List<String> cityOfAustralia = new ArrayList<>();
        cityOfAustralia.add("Sydney");
        cityOfAustralia.add("Melbourne");
        cityOfAustralia.add("Canberra");

        map.put("USA", cityOfUSA);
        map.put("Canada", cityOfCanada);
        map.put("Australia", cityOfAustralia);

        for(Map.Entry<String,List<String>> entry:map.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

    }
}
