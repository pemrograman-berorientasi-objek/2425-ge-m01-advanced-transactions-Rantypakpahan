package fintech.model;

/**
 * @author 12S23008 Ranty Insen Pakpahan
 * @author 12S23048 Grace Caldera Situmorang
 */
public class Transaction {
    static int transactionCounter = 1;
    int id;
    String accountName;
    double amount;
    String postedAt;
    String note;
    double balance;

    public Transaction(String accountName, double amount, String postedAt, String note, double balance) {
        this.id = transactionCounter++;
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = note;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return id + "|" + accountName + "|" + amount + "|" + postedAt + "|" + note + "|" + balance;
    }
}