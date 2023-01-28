package assignments.jan28.assignment1.generics;

/*
        AUTHOR: GAUTAM CHANDRA SAHA
        DATE & TIME: 27/01/23 AT 7:54 PM ON Fri
*/


public class Generic<T> {

    public  void print(T[] args) {

        System.out.print(args.getClass().getSimpleName() + " = ");
        for (T t : args)
            System.out.print(t + " ");
        System.out.println();
    }

}
