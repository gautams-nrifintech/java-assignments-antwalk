package assignments.jan28.assignment1.generics;

/*
        AUTHOR: GAUTAM CHANDRA SAHA
        DATE & TIME: 27/01/23 AT 7:55 PM ON Fri
*/


public class Tester {

    public static void main(String[] args) {

        Generic g = new Generic<Integer>();
        g.print(new Integer[]{1,2,3,4});

        g = new Generic<Double>();
        g.print(new Double[]{1d,2.0,4.237293,5.34432,6d});

        g = new Generic<Float>();
        g.print(new Float[]{1f,2f,4f,5f,6f});

        g = new Generic<String>();
        g.print(new String[]{"Gautam","Chandra","Saha"});

    }
}

/*
OUTPUT:

Integer[] = 1 2 3 4
Double[] = 1.0 2.0 4.237293 5.34432 6.0
Float[] = 1.0 2.0 4.0 5.0 6.0
String[] = Gautam Chandra Saha
 */
