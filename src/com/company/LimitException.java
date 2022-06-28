package com.company;

public class LimitException extends RuntimeException {
    private final double remainingAmount;

    public LimitException(String massage, double remainingAmount) {
        super(massage);
        this.remainingAmount = remainingAmount;
    }

       public void getRemainingAmount() {
        System.out.println("Dear customer, your balance after withdrawal is " + (int) remainingAmount + " KGS.\nPlease, try to withdraw " + (int) remainingAmount + " KGS only.");
    }
}
