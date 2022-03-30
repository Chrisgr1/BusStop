import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;


    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String destination() {
        return destination;
    }

    public int capacity() {
        return capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public boolean canTakePassenger() {
        if(this.passengers.size()<this.capacity) {
            return true;} else {
            return false;}
        }

    public void addPassenger(Person person) {
        if (this.canTakePassenger()) {
            passengers.add(person);
        }
    }

    public Person removePassenger() {
        return this.passengers.remove(passengers.size()-1);
    }
}

