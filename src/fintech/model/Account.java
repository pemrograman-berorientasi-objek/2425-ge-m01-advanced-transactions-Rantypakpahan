package fintech.model;

/**
 * @author 12S23008 Ranty Insen Pakpahan
 * @author 12S23048 Grace Caldera Situmorang
 */

public class Account {
    private String owner;
    private String accountName;
    private double balance;

    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
    }

    public String getAccountName() { // Tambahkan getter ini
        return accountName;
    }
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }
}
