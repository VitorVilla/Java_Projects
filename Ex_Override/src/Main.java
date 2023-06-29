import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 1000);
        acc.withdraw(200);
        System.out.println(acc.getBalance()); // Override Account

        Account acc1 = new SavingsAccount(1002, "Maria", 1000, 0.01);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance()); // Override SavingAccount

        Account acc2 = new BusinessAccount(1003, "Marci", 1000, 500);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance()); // Override BusinessAccount usando super
    }   
}
