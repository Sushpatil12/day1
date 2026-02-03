import com.zeta.Account;
import java.util.logging.Logger;

public class bank {
    Logger logger = logger.getLogger("bank");

    public boolean transfer(Account acc1, Account acc2, float amount) {
        try {
            float res = acc1.withdraw(amount);
        } catch (InsufficientBalanceException insufficientBalanceException) {
            logger.severe(insufficientBalanceException.getMessage());
            return false;
        } catch (IllegalArgumentException illegalArgumentException) {
            logger.severe(illegalArgumentException.getMessage());
        }
        acc2.deposit(amount);
        return true;
    }
}



