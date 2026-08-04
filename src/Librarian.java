public class Librarian extends Person{


    public Librarian(String name, int id) {
        super(name, id);
    }

    @Override
    void displayDetails() {
        System.out.println("Librarian");
        System.out.println(name);
        System.out.println(id);
    }


}