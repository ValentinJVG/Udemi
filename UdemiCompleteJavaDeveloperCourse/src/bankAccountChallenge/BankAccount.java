package bankAccountChallenge;

class BankAccount {
    private int accountNumber, balance, phoneNumber;
    private String customerName, email;

    public BankAccount(int accountNumber, int balance, int phoneNumber, String customerName,
                       String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount() {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositFunds(int depositFunds) {
        this.balance += depositFunds;
        System.out.println("Deposited " + depositFunds + ". Current balance is " + (this.balance));
    }

    public void withdrawFunds(int withdrawFunds) {
        if (this.balance - withdrawFunds < 0) {
            System.out.println("Insufficient funds, only " + this.balance + " is available");

        } else {
            this.balance -= withdrawFunds;
            System.out.println("Current balance after withdraw is " + (this.balance - withdrawFunds));
        }
    }
}
