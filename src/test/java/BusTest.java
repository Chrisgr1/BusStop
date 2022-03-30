import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;


    @Before
    public void beforeEach(){
        bus = new Bus("Home", 10);
        person = new Person();
    }

    @Test
    public void hasDestination(){
        assertEquals("Home", bus.destination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, bus.capacity());
    }

    @Test
    public void hasEmptyPassengerList(){
        assertEquals(0,bus.passengerCount());
    }

    @Test
    public void PassengerCountIsLessThanCapacity(){
        assertEquals(true, bus.canTakePassenger());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }
}