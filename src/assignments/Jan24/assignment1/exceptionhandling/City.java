package assignments.Jan24.assignment1.exceptionhandling;

/*
        AUTHOR: GAUTAM CHANDRA SAHA
        DATE & TIME: 26/01/23 AT 4:45 PM ON Thu
*/


import java.util.HashMap;
import java.util.Map;

public class City {

    private static final int[] ZIPCODES = {737101, 700098, 733202};
    private static final String[] CITIES = {"Gangtok", "Bidhanagar", "Islampur"};
    private static final Map<Integer, String> MAP = new HashMap<>();

    City() {
        for (int i = 0; i < CITIES.length; i++)
            MAP.put(ZIPCODES[i], CITIES[i]);
    }

    String findCityByZipCode(int zipCode) throws Exception {

        String city = MAP.get(zipCode);
        if (city == null)
            throw new CityNotFoundException();

        return "CITY FOUND: " + city;
    }

    public static void main(String[] args) {
        try {
            System.out.println(new City().findCityByZipCode(73711));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

/*

OUTPUT:

EXECUTION 1:

CITY FOUND: Gangtok

EXECUTION 2:

assignments.Jan24.assignment1.exceptionhandling.CityNotFoundException: CITY NOT FOUND.
	at assignments.Jan24.assignment1.exceptionhandling.City.findCityByZipCode(City.java:27)
	at assignments.Jan24.assignment1.exceptionhandling.City.main(City.java:34)

 */

