package enums.payments;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246
/**
 * The PaymentTest class is a test class for creating and printing payment details.
 */
public class PaymentTest {

    /**
     * Main method to create payment instances and print their details.
     */
    public static void main(String[] args) {
        Payment michael = new Payment(234.3,PaymentMethod.CASH);
        Payment ron = new Payment(24.9,PaymentMethod.DEBIT_CARD);
        Payment oleg = new Payment(45,PaymentMethod.BANK_TRANSFER);
        Payment daniel = new Payment(234.3,PaymentMethod.PAYPAL);
        Payment eden = new Payment(234.3,PaymentMethod.CREDIT_CARD);
        michael.printPaymentDetails();
        ron.printPaymentDetails();
        oleg.printPaymentDetails();
        daniel.printPaymentDetails();
        eden.printPaymentDetails();

    }
}
