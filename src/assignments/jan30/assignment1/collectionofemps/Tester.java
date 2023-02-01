package assignments.jan30.assignment1.collectionofemps;

import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(1, "Gautam Chandra Saha", 30000),
                new Employee(2, "Rishav Mitra", 40000),
                new Employee(3, "Rishabh Prasad", 50000)
        };



        System.out.println("Before increment: ");
        Arrays
                .stream(employees)
                .forEach(System.out::println);

        System.out.println("\nAfter increment: ");
        Arrays
                .stream(employees)
                .map(Employee::incSalBy10)
                .forEach(System.out::println);


    }
}

/*

OUTPUT:

Before increment:
Employee{id=1, name='Gautam Chandra Saha', salary=30000.0}
Employee{id=2, name='Rishav Mitra', salary=40000.0}
Employee{id=3, name='Rishabh Prasad', salary=50000.0}

After increment:
Employee{id=1, name='Gautam Chandra Saha', salary=33000.0}
Employee{id=2, name='Rishav Mitra', salary=44000.0}
Employee{id=3, name='Rishabh Prasad', salary=55000.0}

*/