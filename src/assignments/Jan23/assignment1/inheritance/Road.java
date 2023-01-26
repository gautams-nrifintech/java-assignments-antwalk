package assignments.Jan23.assignment1.inheritance;

public class Road {
    public static void main(String[] args) {


        Vehicle truck = new Truck("Red",8,"Eicher 4564", "Bidhanagar, Kolkata");
        System.out.println(truck + "\n");

        Vehicle bus = new Bus("Blue",6,"Ashok Leyland",true);
        System.out.println(bus+ "\n");

        Vehicle car = new Car("Gray",4,"Tata",false);
        System.out.println(car+ "\n");
    }
}
/*

OUTPUT:

Truck honks
Truck has medium amount of space
Truck{'color='Red', noOfWheels=8, model='Eicher 4564', shippingDetails='Bidhanagar, Kolkata'}

Bus honks
Bus has the most space
Bus{'color='Blue', noOfWheels=6, model='Ashok Leyland', isPublicTransport=true}

Car honks
Car has the least space
Car{'color='Gray', noOfWheels=4, model='Tata', isImported=false}

 */