package Assignment3;

import Assignment2.Generic_MyList;

import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    static void main() {
        Generic_MyList<Employee> employees = new Generic_MyList<>();

        employees.add(new Employee(
                "EMP01",
                "Suhani",
                21,
                new Date())
        );

        employees.add(new Employee(
                "EMP02",
                "Rahul",
                24,
                new Date()
        ));

        employees.add(new Employee(
                "EMP03",
                "Ram",
                33,
                new Date()
        ));

        System.out.println("Employee List:");
        employees.display();

        System.out.println("\nEmployee at index 1");
        System.out.println(employees.get(1));

        employees.removeByValue(
                new Employee("EMP02","",0,null)
        );
        System.out.println("\nAfter Removing EMP02");
        employees.display();

    }
}
