public class PaymentProcessor {
    public void ProcessPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin Payment: " + bitcoin.toString());

}
    public void ProcessPayment(CreditCard creditcard) {
        System.out.println("Processing CreditCard Payment: " + creditcard.toString());
    }

    public void ProcessPayment(PayPal paypal) {
        System.out.println("Processing PayPal Payment: " + paypal.getEmail());
    }
    public void processPayment(ApplePay applePay) {
        System.out.println("Processing ApplePay payment for device ID: " + applePay.getDeviceId());
    }
}
