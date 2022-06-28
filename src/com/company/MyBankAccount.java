package com.company;

public class MyBankAccount {
    private double amount;

    public void deposit(double sum) {
        this.amount += sum;
    }

    public int withDraw(int sum) {
        try {
            if (amount < sum) {
                throw new LimitException("Dear customer, you can not withdraw. Sorry for the inconvenience!", getAmount());
            } else {
                amount -= sum;
                System.out.println("Dear customer, your withdrawn amount is " + sum + " KGS.");
            }
        } catch (LimitException cash) {
            System.out.println(cash.getMessage());
            cash.getRemainingAmount();
            amount -= getAmount();
           System.exit(0);
        }
        return 0;
    }
    public double getAmount() {
        return amount;
    }
}