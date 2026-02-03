package com.zeta;

public class SavingAccount extends com.zeta.Account {
    public SavingAccount(int i){
        super(i);
    }
    @Override
    public float deposit(float amount) {
        validate(amount);
        this.setBalance(this.getBalance() + amount);
        return this.getBalance();
    }
    public float validate(float amount){
        if(amount<=0){
            throw new IllegalArgumentException("amount cant be negative ");
        }
    }
    @Override
    public float withdraw(float amount) {
        validate(amount);
         if(this.getBalance()<amount){
             throw new InsufficientBalanceException("Current Bal"+this.getBalance());
         }
         else{
             this.setBalance(this.getBalance() - amount);
             return this.getBalance();
         }
    }
}
