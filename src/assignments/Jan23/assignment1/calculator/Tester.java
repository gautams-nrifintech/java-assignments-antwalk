package assignments.Jan23.assignment1.calculator;

public class Tester {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        float avgOf3Nums = calculator.findAverage(3,4.2f,5);
        float avgOf4Nums = calculator.findAverage(3,4.2f,5,6.5f);
        float avgOf5Nums = calculator.findAverage(3,4.2f,5,6,8.9f);
        System.out.println("avgOf3Nums= " + avgOf3Nums);
        System.out.println("avgOf4Nums= " + avgOf4Nums);
        System.out.println("avgOf5Nums= " + avgOf5Nums);

    }
}

/*
OUTPUT:

avgOf3Nums= 4.07
avgOf4Nums= 4.68
avgOf5Nums= 5.42

* */