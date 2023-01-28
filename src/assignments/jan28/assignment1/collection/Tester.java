package assignments.jan28.assignment1.collection;

/*
        AUTHOR: GAUTAM CHANDRA SAHA
        DATE & TIME: 28/01/23 AT 4:21 PM ON Sat
*/


import java.util.*;

public class Tester {

    static final Scanner GET = new Scanner(System.in);

    public static void print(String args) {
        System.out.println(args);
    }

    public static void main(String[] args) {



        CRUDArray<Integer> crudArray = new CRUDArray<>();

        while (true) {

            System.out.println(
                    "\nMENU\n" +
                            "1.Insert\n" +
                            "2.Display\n" +
                            "3.Search\n" +
                            "4.Delete\n" +
                            "5.Update\n" +
                            "6.Exit\n"
            );

            print("\nEnter choice: ");
            int ch = GET.nextInt();
            switch (ch) {
                case 1:
                    print("Enter empId: ");
                    crudArray.insert(GET.nextInt());
                    break;

                case 2:
                    crudArray.display();
                    break;

                case 3:
                    print("Enter empId: ");
                    crudArray.search(GET.nextInt());
                    break;

                case 4:
                    print("Enter empId: ");
                    crudArray.delete(GET.nextInt());
                    break;

                case 5:
                    print("Enter empId: ");
                    crudArray.update(GET.nextInt());
                    break;

                default:
                    GET.close();
                    System.exit(0);
                    print("Exited\n");
                    break;
            }

        }


    }
}


/*

OUTPUT:

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
1
Enter empId:
12

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
1
Enter empId:
23

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
2
[12, 23]

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
3
Enter empId:
34
Id does not exists

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
3
Enter empId:
23
Id found at index 1

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
4
Enter empId:
23
Id deleted suucessfully

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
2
[12]

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
5
Enter empId:
12
45
Id updated from 12 to 45

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
2
[45]

MENU
1.Insert
2.Display
3.Search
4.Delete
5.Update
6.Exit


Enter choice:
6
 */