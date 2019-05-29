package bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    public String holderName; // instance variables and fields...
    public String accountNumber;
    private Date openingDate;
    public final int RATE_OF_INTEREST = 10;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(String holderName, String accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingDate = openingDate;

    }

    public double getBalance() {
        return getBalance(0);
    }

    public Account credit(double amount, Date transactionDate) {
        Transaction creditAmount = new Transaction(accountNumber, transactionDate, amount);
        transactions.add(creditAmount);
        this.balance += amount;
        return this;

    }

    public void debit(double amount, Date transactionDate) { //setter is set the value and update
        if (amount < balance) {
            this.balance -= amount;
            Transaction debitAmount = new Transaction(accountNumber, transactionDate, -amount);
            transactions.add(debitAmount);
        }

    }


    public double getBalance(int years) {
        return balance * RATE_OF_INTEREST * years / 100 + balance;
    }

    public List<Transaction> getPassBook() {
        return transactions;
    } // getter is give the value.

    @Override
    public String toString() {
        return holderName + ", " + accountNumber + ", " + balance;
    }
}

//Entity something which changes with time.
//TDD Test divine Development.
//Feature
//SI = rateofInterest/principalAmount/time
//act as a function which takes paramters constructor.
//Method overloading. parameter type overloading support.
// todo Constructor => default,