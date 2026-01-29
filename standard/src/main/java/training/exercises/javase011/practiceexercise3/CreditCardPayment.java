package training.exercises.javase011.practiceexercise3;

public class CreditCardPayment extends Payment {
    protected int cardNumber;
    protected int expiryDate;

    public CreditCardPayment(double amount, String paymentDate, int cardNumber, int expiryDate) {
        super(amount, paymentDate);
        setCardNumber(cardNumber);
        setExpiryDate(expiryDate);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("payment being processed");
    }

    @Override
    public String getPaymentDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPaymentDetails'");
    }
}
