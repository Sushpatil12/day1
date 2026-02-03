package com.zeta;

public abstract class Account {
     float balance; //mutable
     private final int number; //immutable (read only)
    ACCOUNT_TYPE type; //immutable
    public abstract float deposit(float amount );
    public abstract float withdraw(float amount);
    public  float getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public ACCOUNT_TYPE getType() {
        return type;
    }

    public void setType(ACCOUNT_TYPE type) {
        this.type = type;
    }

    public Account(int number) {
        this.number = number;
    }

}
