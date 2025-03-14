package fintech.driver;
import fintech.model.Account;
import fintech.model.DigitalWallet;
import fintech.model.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author NIM Nama
 * @author NIM Nama
 */

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Account> accounts = new HashMap<>();
        List<Transaction> transactions = new ArrayList<>();
        DigitalWallet wallet = new DigitalWallet();

        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");
            String command = parts[0];

            switch (command){
            case "create-account":
            if (parts.length == 3) {
                String owner = parts[1];
                String accountName = parts[2];
                Account account = new Account(owner, accountName);
                accounts.put(accountName, account);
            }

            break;

            case "find-account":
            if (parts.length == 2) {
                wallet.findAccount(parts[1]);
            }
            break;

            case "create-transaction":
            if (parts.length == 6){
                String accountName = parts[1];
                double amount = Double.parseDouble(parts[2]);
                String postedAt = parts[3];
                String note = parts[4];
                double balance = Double.parseDouble(parts[5]);
                                
                Transaction transaction = new Transaction(accountName, amount, postedAt, note, balance);
                transactions.add(transaction);  
            }
            break;

            
            case "show-account":
            
            wallet.showAccounts();
            wallet.showTransaction();
            }
            
        }

        // Menampilkan semua akun setelah input selesai
        
        scanner.close();
    }
}