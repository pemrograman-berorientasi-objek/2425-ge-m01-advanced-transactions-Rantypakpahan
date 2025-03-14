package fintech.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalWallet {
    Scanner scanner = new Scanner(System.in);
    private List<Account> accounts;
    private List<Transaction> transaction;

    public DigitalWallet() {
        accounts = new ArrayList<>(); // Menggunakan ArrayList untuk efisiensi akses
        transaction = new ArrayList<>();
    }

    public void createAccount(String owner, String accountName) {
        Account newAccount = new Account(owner, accountName);
        accounts.add(newAccount); // Menambahkan akun secara urut
    }

    public void createTransaction(String accountName, double amount, String postedAt, String note, double balance){
        Transaction newTransaction = new Transaction(accountName, amount, postedAt, note, balance);
        transaction.add(newTransaction);
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public void showAccounts(){
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    public void showTransaction(){
        for (Transaction transaction : transaction) {
            System.out.println(transaction);
        }
    }

    public void findAccount(String searchKey) {
        for (Account account : accounts) {
            if (account.getAccountName().equalsIgnoreCase(searchKey)) {
                System.out.println(account); // Menampilkan akun yang ditemukan
            }
        }
    }
}




// package fintech.model;

// import java.util.ArrayList;
// import java.util.List;

// public class DigitalWallet {
//     private List<Account> accounts;
//     private List<Transaction> transaction;

//     public DigitalWallet() {
//         accounts = new ArrayList<>(); // Menggunakan ArrayList untuk efisiensi akses
//         transaction = new ArrayList<>();
//     }

//     public void createAccount(String owner, String accountName) {
//         Account newAccount = new Account(owner, accountName);
//         accounts.add(newAccount); // Menambahkan akun secara urut
//     }

//     public void createTransaction(String accountName, double amount, String postedAt, String note, double balance){
//         Transaction newTransaction = new Transaction(accountName, amount, postedAt, note, balance);
//         transaction.add(newTransaction);
//     }

//     public void displayAccounts() {
//         for (Account account : accounts) {
//             System.out.println(account);
//         }
//     }

//     public void showAccounts(){
//         for (Account account : accounts) {
//             System.out.println(account);
//         }
//     }
//     public void showTransaction(){
//         for (Trans transaction : transaction) {
//             System.out.println(transaction);
//         }
//     }

//     public void findAccount(String searchKey) {
//         for (Account account : accounts) {
//             if (account.getAccountName().equalsIgnoreCase(searchKey)) {
//                 System.out.println(account); // Menampilkan akun yang ditemukan
//             }
//         }
//     }
// }