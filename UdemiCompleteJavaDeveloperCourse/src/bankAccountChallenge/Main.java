package bankAccountChallenge;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(2000);
        bankAccount.depositFunds(500);
        bankAccount.withdrawFunds(3000);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);

        VipCustomer person3 = new VipCustomer("Tom", 10000.00, "tom@email.com");
        System.out.println(person3.getName());
        System.out.println(person2.getCreditLimit());
    }
}

