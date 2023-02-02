package assignments.feb1.assignment1.localfunctionalinterface;

import java.util.Arrays;

@FunctionalInterface
interface LocalFunctionalInterface {

    abstract double cube(float n);

    default double square(float n){
        return Math.pow(n,2);
    }

    default double add(Float ...nums){
        return Arrays.stream(nums).reduce( 0f, Float::sum);
    }

    static double sub(Float n1, Float n2){
        return n1 - n2;
    }

    static double mul(Float ...nums) {
        return Arrays.stream(nums).reduce(1f, (first, sec) -> first * sec);
    }

    static double div(Float n1, Float n2){
        return n2 > 0 ? n1/n2 : -1;
    }
}
