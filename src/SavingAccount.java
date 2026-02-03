package com.zeta;

public class SavingAccount extends com.zeta.Account {
    public SavingAccount(int i){
        super(i);
    }
    @Override
    public float deposit(Account acc ,float amount) {
        validate(amount);
        float depositedBalance= acc.getBalance();
        depositedBalance+=amount;
        acc.setBalance(depositedbal);
        return depositedBalance;
    }
    public float validate(float amount){
        if(amount<=0){
            throw new IllegalArgumentException("amount cant be negative ");
        }
    }
    @Override
    public float withdraw(Account acc,float amount) {
        validate(amount);
         if(acc.getBalance()<amount){
             throw new InsufficientBalanceException("Money is not sufficient to withdraw");
         }
         else{
             float withdrawBalance=acc.getBalance();
             withdrawBalance-=amount;
             acc.setBalance(withdrawBalance);
             return withdrawBalance;
         }
    }
}
