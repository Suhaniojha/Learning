package BE_Training;

public class Member extends Person {
    protected int booksIssued;

    public Member(String name, int id) {
        super(name, id);
    }

    public void issueBook(){
        booksIssued++;
    }
    public void returnBook(){
        booksIssued--;
    }
    public int getBooksIssued(){
        return booksIssued;
    }

    @Override
    void displayDetails() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(booksIssued);
    }
}
