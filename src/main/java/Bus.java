import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if(hasSpace()){
            this.passengers.add(person);
        }
    }

    public boolean hasSpace(){
        return this.capacity > getNumberOfPassengers();
    }

    public Person removePassenger() {
        return this.passengers.remove(0);
    }

//    Need a method to pick up a passenger
//    Method should take in one parameter - a bus stop
//    Call removePassenger() on the bus stop - save it into a variable
//    Add removed person variable to the passengers arrayList of bus

}
