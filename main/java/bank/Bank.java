package bank;
import java.time.LocalDate;
import java.util.List;

public class Bank {
    private static int numberOfCount;

    public static void main(String[] args) {
        System.out.println(createAccount("komal"));
    }
    public static Account createAccount(String name){
        numberOfCount++;
        Account account = new Account(name,Integer.toString(numberOfCount),0);
        return account;
    }
}
