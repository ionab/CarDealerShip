import components.Engine;
import components.FuelTank;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Dealer;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dealer;
    Customer customer;
    Car car;
    Engine engine;
    FuelTank fuelTank;

    @Before
    public void before(){
        dealer = new Dealer("Bob", 50000.00);
        customer = new Customer("Sheila", 50000.00);
        fuelTank = new FuelTank(100);
        engine = new Engine(1.8, fuelTank);
        car = new Car(5, 10000, "Green", engine);

    }
    @Test
    public void canGetDealerName(){
        assertEquals("Bob", dealer.getName());
    }

    @Test
    public void canGetDealerMoney(){
        assertEquals(500000.00, dealer.getMoney(), 0.01);
    }

    @Test
    public void sellingCarIncreaseDealerMoney(){
        dealer.sellCar(car,customer);
        assertEquals(60000, dealer.getMoney(), 0.01);
    }
}
