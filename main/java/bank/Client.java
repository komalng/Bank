package bank;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Account komal = new Account("komal", "jklashdk", 00.00);
        komal.credit(100, new Date(2000, 12, 16));
        komal.debit(-10, new Date(2000, 12, 16));
        for (Transaction transaction : komal.getPassBook()) {
            System.out.println(transaction);
        }

    }
}
