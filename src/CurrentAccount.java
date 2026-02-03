import com.zeta.Account;

public class CurrentAccount extends Account {
    public CurrentAccount(int number){
        super(number);
    }
    @Override
    public float deposit(Account acc ,float amount) {
        validate(amount);
        float depositedBalance= acc.getBalance();
        depositedBalance+=amount;
        acc.setBalance(depositedbal);
        return depositedBalance;
    }
    public float validate( float amount){
        if(amount<=0){
            throw new IllegalArgumentException("amount cant be negative ");
        }
    }
    @Override
    public float withdraw(Account acc, float amount) {
        validate(amount);
        if(acc.getBalance()<amount){
            throw new InsufficientBalanceException("Money is not sufficient to withdraw");
        }
        else{
        float withdrawBalance= acc.getBalance();
        withdrawBalance-=amount;
        acc.setBalance(withdrawbal);
        return withdrawBalance;
        }
    }
}
