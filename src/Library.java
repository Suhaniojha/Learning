import java.util.ArrayList;

public class Library {
    ArrayList<Book> Books = new ArrayList<>();

    void addBook(Book book){
        Books.add(book);
    }
    void issueBook(Book book, Member member) throws Exception{


        if (!book.available){
            throw new BookNotAvailableException("Book unavailable right now!");
        }

        if(member.getBooksIssued()>=3){
            throw new LimitExceededException("You Cannot Issue More Than 3 Books");
        }

        book.available=false;
        member.issueBook();
    }

    void returnBook(Member member, Book book){

        if(!book.available){
            book.available=true;
            member.returnBook();
        }else{
            System.out.println("Book is already available.");
        }
    }

    Book SearchBook(String title){
        for(Book book: Books){
            if( book.title.toLowerCase().contains(title.toLowerCase())){
                return book;
            }
        }
        return null;
    }

    void displayBooks(){
        for(Book book: Books){
            System.out.println(book);
        }
    }

}