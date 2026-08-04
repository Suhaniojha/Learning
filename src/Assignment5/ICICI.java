package Assignment5;

public class ICICI extends Bank {

    @Override
    public double calculate(double amount) {

        double totalCharge = defaultTransactionCharge + 0.01;

        return amount * totalCharge;
    }
}