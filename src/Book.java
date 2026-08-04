public class Book {
    String title;
    String author;
    boolean available;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        available = true;
    }
    @Override
    public String toString() {
        return "Title: " + title +
                "\nAuthor: " + author +
                "\nAvailable: " + available;
    }
}
