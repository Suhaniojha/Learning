package Assignment5;

public class Bank {

    protected double defaultTransactionCharge;

    public Bank() {
        defaultTransactionCharge = 0.02;   // 2%
    }

    public double calculate(double amount) {
        return amount * defaultTransactionCharge;
    }
}