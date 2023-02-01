package assignments.jan30.assignment1.collectionofstrings;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] strings = {
                "Gautam",
                "Chandra",
                "Saha"
        };

        Arrays
                .stream(strings)
                .filter( s -> s.length() > 5 && s.length() < 8 )
                .forEach(System.out::println);

    }

}


/*
OUTPUT:

Gautam
Chandra

 */