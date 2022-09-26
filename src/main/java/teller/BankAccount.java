package teller;

public class BankAccount {

    private String accountNumber;
    private String type;
    private int balance;

    public BankAccount(String accountNumber, String type, int balance) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void withdrawal(int amountToWithdrawal) {
        balance -=amountToWithdrawal;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amountToDeposit) {
        balance +=amountToDeposit;
    }
}
