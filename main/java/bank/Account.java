package bank;

import java.util.Date;

public class Account {
    public String holderName; // instance variables and fields...
    public String accountNumber;
    private Date openingDate;
    public final int RATE_OF_INTEREST=10;
    private double balance;

    public Account(String holderName, String accountNumber, double balance, Date openingDate) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingDate = openingDate;
    }

    public double getBalance() {
        return getBalance(10);
    }


    @Override
    public String toString() {
        return holderName + ", " + accountNumber + ", " + balance;
    }

    public void credit(double amount) {
        this.balance += amount;

    }

    public void debit(double amount) {
        if (amount < balance) {
            this.balance -= amount;
        }

    }
    public double getBalance(int years){
        return balance*RATE_OF_INTEREST*years /100 +balance;
    }


}

//Entity something which changes with time.
//TDD Test divine Development.
//Feature
//SI = rateofInterest/principalAmount/time
//act as a funcation which takes paramters constructor.
//Method overloading. parameter type overloading support.
// todo Constructor => default,