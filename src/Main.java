public class Main {
    public static void main(String[] args) {
             PaymentProcessor processor = new PaymentProcessor();
             //Bitcoin
             Bitcoin bitcoin = new Bitcoin();
             processor.ProcessPayment(bitcoin);
             //Credit card
             CreditCard creditcard = new CreditCard();
             processor.ProcessPayment(creditcard);
             //PayPal
             PayPal paypal = new PayPal();
             processor.ProcessPayment(paypal);

    }
}