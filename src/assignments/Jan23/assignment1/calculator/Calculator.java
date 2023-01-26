package assignments.Jan23.assignment1.calculator;

public class Calculator {

    /*
    * @description : method to find average of numbers
    * @params : number or [numbers...,]
    * @returnType : float
    * */
    float findAverage(float ...numbers){

        float  sum = 0f;

        for (var f : numbers) {
            sum += f;
        }

        return Math.round((sum / numbers.length) * 100f) / 100f; // rounded off to 2 decimal places
    }


}
