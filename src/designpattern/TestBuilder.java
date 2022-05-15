package designpattern;

public class TestBuilder {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount
                .BankAccountBuilder("Boby Smith","6742098")
                .withEmail("boby@abc.com")
                .wantNewsletter(false)
                .build();
        System.out.println("Bank Account owner: " + bankAccount.getName()+ " has email in the list "
                + bankAccount.getEmail() + " want newsletter so it is not sent");

    }
}
