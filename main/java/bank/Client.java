package bank;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current date is " + currentDate);

        Account komal = new Account("komal", "kl", 00.00, new Date(2019, 2, 19));
        komal.debit(200);
        komal.getBalance(3);
        System.out.println(komal);
    }

}

// package related things contains