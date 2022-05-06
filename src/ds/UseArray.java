package ds;

public class UseArray {
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0] = 10;
        array[1] = 4;
        array[3] = 9;

        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
