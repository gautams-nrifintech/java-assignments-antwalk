package assignments.feb1.assignment1.localfunctionalinterface;

import java.util.Arrays;

public class Tester {


    public static void main(String[] args) {

        LocalFunctionalInterface functionalInterface = (float a) -> Math.pow(a, 3);

        print("Cube of 2: " + functionalInterface.cube(2));
        print("square of 2: " + functionalInterface.square(2));

        Float[] operands = {1f, 2f, 3f, 4f};

        print("addition of " + Arrays.toString(operands) + " is : " + functionalInterface.add(operands));
        print("multiplication of " + Arrays.toString(operands) + " is : " + LocalFunctionalInterface.mul(operands));
        print("subtraction of 5-3 is: "  + LocalFunctionalInterface.sub(5f,3f));
        print("division of 5/2 is: " + LocalFunctionalInterface.div(5f, 2f));
    }

    private static void print(Object object) {
        System.out.println(object);
    }
}

/*

OUTPUT:

Cube of 2: 8.0
square of 2: 4.0
addition of [1.0, 2.0, 3.0, 4.0] is : 10.0
multiplication of [1.0, 2.0, 3.0, 4.0] is : 24.0
subtraction of 5-3 is: 2.0
division of 5/2 is: 2.5


 */
