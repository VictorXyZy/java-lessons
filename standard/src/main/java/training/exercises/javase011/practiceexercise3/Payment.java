package training.exercises.javase011.practiceexercise3;

public abstract class Payment {

    protected double amount;
    protected String paymentDate;

    public Payment(double amount, String paymentDate) {
        setAmount(amount);
        setPaymentDate(paymentDate);

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public abstract void processPayment();

    public abstract String getPaymentDetails();

    public boolean validateAmount() {
        return amount > 0;
    }
}
