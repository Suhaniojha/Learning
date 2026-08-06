package Assignment2;

public class Main {

    public static void main(String[] args) {
//String
        Generic_MyList<String> names = new Generic_MyList<>();

        names.add("Suhani");
        names.add("Rahul");
        names.add("Aman");

        names.display();

        names.removeByValue("Rahul");

        names.display();

//Integer
        Generic_MyList<Integer> list = new Generic_MyList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();

        System.out.println("Element at index 2 : " + list.get(2));

        list.removeByIndex(1);

        list.display();

        list.removeByValue(40);

        list.display();

        System.out.println("Size : " + list.size());

    }
}