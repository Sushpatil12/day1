import com.zeta.Account;
import java.util.logging.Logger;

public class bank {
    Logger logger = logger.getLogger("bank");

    void transfer(Account acc1, Account acc2, float amount) {
        try {
            acc1.withdraw(amount);
        } catch (InsufficientBalanceException insufficientBalanceException) {
            logger.severe(insufficientBalanceException.getMessage());
        } catch (IllegalArgumentException illegalArgumentException) {
            logger.severe(illegalArgumentException.getMessage());
        }
        try{    
        acc2.deposit(amount);   
    } catch (IllegalArgumentException illegalArgumentException) {
            logger.severe(illegalArgumentException.getMessage());
     }
}



