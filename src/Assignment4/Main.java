package Assignment4;

public class Main {
    public static void main() {
        Ex number = new Ex(1);
        try{
            number.checkDigit();

        }catch(MoreThanOneDigitException e){
            System.out.println(e.getMessage());
        }
    }
}
