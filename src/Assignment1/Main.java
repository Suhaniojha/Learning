package Assignment1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            MyList list = new MyList();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);

        System.out.println("After Adding:");
        list.display();

        System.out.println("\nElement at index 2 : "
                + list.get(2));

        list.removeByIndex(1);
        System.out.println("\nAfter Removing Index 1:");
        list.display();

        list.removeByValue(40);

        System.out.println("\nAfter Removing Value 40:");
        list.display();

        System.out.println("\nCurrent Size : "
                + list.size());
    }
}