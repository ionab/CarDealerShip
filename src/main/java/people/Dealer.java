package people;


import people.Customer;
import vehicles.Vehicle;

public class Dealer extends Person{

    Vehicle vehicle;
    Customer customer;
    public Dealer(String name, double money) {
        super(name, money);
    }

    public void sellCar(Vehicle vehicle, Customer customer){

        if (vehicle.canBuy(customer) == true){
            money += vehicle.getPrice();
            customer.money -= vehicle.getPrice();
        }
    }
}
