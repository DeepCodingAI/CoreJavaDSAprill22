package nestedclass;

public class PaymentTerminal {

    public void makePayment(String paymentType, int amount){
        if(paymentType.equalsIgnoreCase("cash")){
            PayByCash.payByCash(amount);
        }else if(paymentType.equalsIgnoreCase("credit-card")){
            PayByCreditCard.payByCreditCard(amount);
        }else if(paymentType.equalsIgnoreCase("crypto")){
            PayByCrypto.payByCrypto(amount);
        }else if(paymentType.equalsIgnoreCase("paypal")){
            PayByPaypal.payByPaypal(amount);
        }else if (paymentType.equalsIgnoreCase("apple-pay")){
            PayByApplePay.payByApplePay(amount);
        }
        System.out.println("payment has been processed successfully");
    }

    private static class PayByCash{
        private static void payByCash(int amount){
            System.out.println(amount + " has been paid by cash");
        }
    }
    private static class PayByCreditCard{
        private static void payByCreditCard(int amount){
            System.out.println(amount + " has been paid by credit card");
        }
    }
    private static class PayByCrypto{
        private static void payByCrypto(int amount){
            System.out.println(amount + " has been paid by crypto");
        }
    }
    private static class PayByPaypal{
        private static void payByPaypal(int amount){
            System.out.println(amount + " has been paid by paypal");
        }
    }
    public static class PayByApplePay{
        public static void payByApplePay(int amount){
            Pay pay = new Pay(){
                @Override
                public void processPaymentByApplePay(int amount){
                    System.out.println("System will take apple Pay the amount of:  " + amount);
                }
            };
            pay.processPaymentByApplePay(amount);
        }
        @FunctionalInterface
        public interface Pay{
            void processPaymentByApplePay(int amount);
        }
    }
}
