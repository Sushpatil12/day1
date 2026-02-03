import com.zeta.Account;
import com.zeta.SavingAccount;
import com.zeta.CurrentAccount;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Account account=new SavingAccount(12);
        Account current = new CurrentAccount(999);
        List<Account> accounts = new ArrayList<>();
        accounts.add(acc);
        accounts.add(current);
        accounts.forEach(account1 -> {
            account1.deposit(2000);
        });
        accounts.forEach(account1 -> {
            account1.withdraw(2000);
        });
        System.out.println("amount in acc: "+ acc.getBalance());
        System.out.println("amount in curr_acc: "+ current.getBalance());
        Bank bank = new Bank();
        bank.transfer(acc, current, 20);
        System.out.println("amount in acc: "+ acc.getBalance());
        System.out.println("amount in curr_acc: "+ current.getBalance());
        
    }
}

