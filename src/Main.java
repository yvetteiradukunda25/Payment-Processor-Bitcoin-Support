public class Main {
    public static void main(String[] args) {
             PaymentProcessor processor = new PaymentProcessor();
             //Bitcoin
             Bitcoin bitcoin = new Bitcoin("347282918895955");
             processor.ProcessPayment(bitcoin);
             //Credit card
             CreditCard creditcard = new CreditCard("2182457472662", "28/4/2025");
             processor.ProcessPayment(creditcard);
             //PayPal
             PayPal paypal = new PayPal("iradyvette98@gmail.com");
             processor.ProcessPayment(paypal);

    }
}