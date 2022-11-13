package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit (double sum){
        amount+=sum;
        System.out.println(amount);
    }
    public void withDraw (int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("error", amount);
        }
        amount-=sum;

        System.out.println("your money: "+amount);



    }}
