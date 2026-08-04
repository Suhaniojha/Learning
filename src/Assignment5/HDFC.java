package Assignment5;

public class HDFC extends Bank {

    @Override
    public double calculate(double amount) {

        double totalCharge = defaultTransactionCharge + 0.005;

        return amount * totalCharge;
    }
}