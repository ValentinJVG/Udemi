package bankAccountChallenge;

public class VipCustomer {
    private String name, emailAddress;
    private double creditLimit;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
         this(name, creditLimit, "unknown@email.com");
    }

    public  VipCustomer() {
        this("Default name", 10.000, "some@email.com");
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
