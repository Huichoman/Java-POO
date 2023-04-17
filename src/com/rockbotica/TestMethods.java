package com.rockbotica;

public class TestMethods {
    public static void main(String[] args) {
        Account accountA =  new Account();
        Account accountB = new Account();

        accountA.addFunds(2000);
        accountB.addFunds(1000);

        System.out.println("account A funds = " + accountA.funds);
        System.out.println("account B funds = " + accountB.funds);

        accountB.withdraw(200);
        System.out.println();
        System.out.println("account B funds = " + accountB.funds);

        if(accountA.transfer(500, accountB))
            System.out.println("Successful transfer");
        else System.out.println("You have insufficient funds to make this transaction");
        System.out.println("account A funds = " + accountA.funds);
        System.out.println("account B funds = " + accountB.funds);
    }
}
