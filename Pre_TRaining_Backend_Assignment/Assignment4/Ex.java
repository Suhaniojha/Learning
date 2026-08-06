package Assignment4;

public class Ex {
     int digit;

    public Ex(int digit){
        this.digit = digit;
    }

    public void checkDigit() throws MoreThanOneDigitException{
        if(digit<-9||digit>9){
            throw new MoreThanOneDigitException("Number has more than one digit.");
        }

        System.out.println("Valid single-digit number.");
    }
}
