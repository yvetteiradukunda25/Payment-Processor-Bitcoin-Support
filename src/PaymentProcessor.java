public class PaymentProcessor {
    public void ProcessPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin Payment");

}
    public void ProcessPayment(CreditCard creditcard) {
        System.out.println("Processing CreditCard Payment");
    }

    public void ProcessPayment(PayPal paypal) {
        System.out.println("Processing PayPal Payment");
    }
}
