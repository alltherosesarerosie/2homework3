package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bAcc = new BankAccount();
        System.out.print ("money on your account: ");
        bAcc.deposit(20000);
        while (true){
            try{
                bAcc.withDraw(6000);
                System.out.println("successful done");

            }catch (LimitException le){

                try {
                    System.out.println("insufficient funds: "+ bAcc.getAmount());
                    bAcc.withDraw((int) le.getRemainingAmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                System.out.println(le.getMessage());
                break;
            }
        }


    }
}
