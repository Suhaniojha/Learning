package BE_Training;

public class BookNotAvailableException extends Exception{

    public BookNotAvailableException(String message){
        super(message);
    }
}