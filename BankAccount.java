package bankaccount;

import java.util.ArrayList;

public class BankAccount {

    private int accountsOpened = 0;
    private int number;
    private double amount;
    private String name;
    private boolean active;
    private ArrayList<String> transactions = new ArrayList();

    public BankAccount() {
        System.out.println("Created a new BankAccount1!!");
        transactions.add("Created BankAccount1");
        accountsOpened++;
    }

    public BankAccount(int number, String name) {
        this.name = name;
        this.number = number;
        System.out.println(name+" created BankAccount number: "+number );
        
        transactions.add("Created BankAccount");
        accountsOpened++;
    }

    public BankAccount(int number, double amount, String name, boolean active) {
        this.name = name;
        this.amount = amount;
        this.number = number;
        this.active = active;
        System.out.println(name + " created BankAccount number: " + number);
        transactions.add("Created BankAccount");
        accountsOpened++;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

//    public void setName(String name) {
//        this.name = name;
//    } //πρεπει να το κανω private ωστε να μην αλλαζει το ονομα

    public void setActive(boolean active) {
        this.active = active;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public int howManyAccountsOpened() {
        return accountsOpened;
    }

    public void deposit(int number, double amount, boolean active) {
        this.amount += amount;
        this.transactions.add("Deposited: " + String.format("%.2f", amount) + "€");
    }

    public void withdrow(int number, double amount, boolean active) {
        if (this.amount < amount) {
            System.out.println("Your account has only" + this.amount + "I will withdow them");
            transactions.add("Withdrew " + this.amount + " euros");
            this.amount = 0;
        } else {
            this.amount -= amount;
            transactions.add("Withdrew " + this.amount + " euros");
        }

    }

    public void setDetails(int number, double amount, String name, boolean active) {
        this.number = number;
        //setNumber(number);
        this.amount = amount;
        this.name = name;
        this.active = active;

    }

}
