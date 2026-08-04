package Assignment5;

public class Main {
    static void main() {
        ICICI icici = new ICICI();
        System.out.println("ICIC Charge ="
               + icici.calculate(1000));

        HDFC hdfc = new HDFC();
        System.out.println("HDFC Charge =" + hdfc.calculate(5000));
    }
}
