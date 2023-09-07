package enums.payments;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246

public class Payment {
    /**
     * represent the amount of payment.
     */
    private double amount;
    /**
     * represent the method of paying.
     */
    private PaymentMethod method;
    /**
     * represent the payment reference number.
     */
    private String referenceNumber;

    /**
     * constructor of the class
     *
     * @param amount represent the amount of payment.
     * @param method represent the method of paying.
     */
    public Payment(double amount, PaymentMethod method) {
        this.amount = amount;
        this.method = method;
        this.referenceNumber = "REF" + (int) (Math.random() * 1000000);
    }

    /**
     * printing the payment details.
     */
    public void printPaymentDetails() {
        System.out.println("The amount is:" + amount + "\n"
                + "The payment method is:" + method + "\n" +
                "The reference number is:" + referenceNumber);
    }

}
