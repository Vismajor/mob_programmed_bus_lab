import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void setUp(){
        bus = new Bus("Newhaven", 30);
        person = new Person();
    }

    @Test
    public void startWithNoPassengers(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
//        ACT
        bus.addPassenger(person);
//        ASSERT
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void cannotAddPassengerIfFull(){
        Bus minibus = new Bus("Java Town", 1);
        minibus.addPassenger(person);
        minibus.addPassenger(person);
        assertEquals(1, minibus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassengerFromBusStop(){
//        Add person to bus stop (Don't forget to create bus stop in setup above)
//        Call pickUp() method on bus, and pass in the busStop
//        Check if number of passengers in the bus went up by one
    }

}
