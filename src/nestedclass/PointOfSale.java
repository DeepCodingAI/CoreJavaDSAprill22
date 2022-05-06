package nestedclass;

import java.util.Scanner;

public class PointOfSale {
    public static void main(String[] args) {
        System.out.println("Your amount is $100, How do you like to make the payment");
        Scanner sc = new Scanner(System.in);
        String paymentType  = sc.nextLine();
        PaymentTerminal paymentTerminal = new PaymentTerminal();
        paymentTerminal.makePayment(paymentType, 100);
    }
}
