package com.rockbotica;

public class Account {
    double funds;
    int agency;
    int number;
    String holder;

    public void addFunds(double value) {
        this.funds += value;
    }

    public boolean withdraw(double value){
        if(this.funds >= value){
            this.funds -= value;
            return true;
        }else return false;
    }

    public boolean transfer(double value, Account account){
        if(withdraw(value)){
           account.addFunds(value);
           return true;
        }else return false;
    }

}
