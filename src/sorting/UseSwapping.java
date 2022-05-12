package sorting;

public class UseSwapping {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Before Swapping");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        int temp = 0;
        temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println("After Swapping");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

    }
}
