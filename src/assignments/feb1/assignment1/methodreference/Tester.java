package assignments.feb1.assignment1.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Tester {

    interface PersonInterface{
        Person getPerson(Integer age, String name);
    }

    public static void main(String[] args) {

        PersonInterface pf = Person::new;
        Person gautam = pf.getPerson(22, "Gautam Chandra Saha");
        System.out.println(gautam);

    }

}

/*

OUTPUT:
Employee{age=22, name='Gautam Chandra Saha'}

 */
