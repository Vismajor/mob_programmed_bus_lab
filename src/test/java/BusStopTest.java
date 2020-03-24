import org.junit.Before;
import org.junit.Test;

public class BusStopTest {

    BusStop busStop;

    @Before
    public void setUp(){
        busStop = new BusStop("Fishmarket");
    }

    @Test
    public void queueStartsEmpty(){
//        Check if the array called queue is empty
    }

    @Test
    public void canAddPersonToQueue(){
//        Add a person to the queue (don't forget to create a person variable in the setup above)
//        Check if the number of people in queue went up by one
    }

    @Test
    public void canRemovePersonFromQueue(){
//        Add person to the busstop
//        Remove person from the busstop (look at Bus class for inspiration)
//        Check if the queue is empty after removing person
    }

}
