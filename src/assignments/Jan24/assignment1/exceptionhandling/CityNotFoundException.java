package assignments.Jan24.assignment1.exceptionhandling;

/*
        AUTHOR: GAUTAM CHANDRA SAHA
        DATE & TIME: 28/01/23 AT 5:37 PM ON Sat
*/


public class CityNotFoundException extends Exception{

    public CityNotFoundException() {
        super("City not found.".toUpperCase());
    }
}
