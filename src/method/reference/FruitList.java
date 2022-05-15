package method.reference;

import java.util.Arrays;
import java.util.List;

public class FruitList {
    public static void main(String[] args) {
        List<String> fruitList = Arrays.asList("Mango","Banana","Olive","Berries");
        System.out.println("Using for each loop");
        for (String fruit:fruitList){
            System.out.println(fruit);
        }
        System.out.println("Using for each loop with method reference");
        fruitList.forEach(System.out::println);
        fruitList.forEach(NaturalFruits::nameSomeFruits);

        System.out.println("Using stream");
        fruitList.stream()
                .filter((fruitName->fruitName.startsWith("B")))
                .forEach(System.out::println);

    }
}
