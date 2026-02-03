import com.zeta.Account;
import com.zeta.SavingAccount;
import com.zeta.CurrentAccount;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Account account=new SavingAccount(12);
        Account current = new CurrentAccount(999);
        bank bank=new bank();
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(current);
        accounts.forEach(account1 -> {
            account1.deposit(2000);
        });
    }
}

