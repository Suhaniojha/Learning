//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("Java","James");
        Book b2 = new Book("Python", "Mark");
        Book b3 = new Book("Spring", "John");
        Book b4 = new Book("DBMS", "Navathe");

        Member m1 = new Member("Suhani", 111);
        Librarian l1 = new Librarian("Amit", 1);
        m1.displayDetails();
        l1.displayDetails();

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);

        try{
            library.issueBook(b1,m1);
            library.issueBook(b2,m1);
            library.issueBook(b3, m1); // 3rd book (allowed)

            m1.displayDetails();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        library.displayBooks();

        library.returnBook(m1,b4);

        System.out.println(library.SearchBook("java"));


    }
        }

