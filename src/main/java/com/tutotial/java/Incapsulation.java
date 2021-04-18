package com.tutotial.java;

class Account{
    private double balance = 0;

    public void debit(double amount){
        if(amount>0 && amount <= balance){
            amount -= balance;
        }

    };

    public  void credit(double amount){
        if(amount >0){
            balance+=amount;
        }
    }

    void showBalance(){
        System.out.println("Current balance - " + balance);
    }
}
public class Incapsulation {
    public static void main(String[] args) {
        Account a1;

        a1 = new Account();
        a1.credit(1000);
        a1.debit(2000);

        a1.showBalance();

    }
}
