package vehicles;
import components.Engine;
import components.FuelTank;


public class Car extends Vehicle implements Driveable{

    Car car;
    Engine engine;
    int distance;
    FuelTank fuelTank;

    public Car(int capacity, double price, String colour, Engine engine) {
        super(capacity, price, colour);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getEngineSize(){
        return engine.getSize();
    }

    public double getFuelTankCapacityFromEngine(){
        return engine.getFuelTankCapacity();
    }

    public double calculateVehicleEfficency(){
        double baseline_value = 56;
        return (baseline_value/ getEngineSize());
    }

    public void drive(double distance){
        double fuelRemaining;
        fuelRemaining = ((getFuelTankCapacityFromEngine() -= (distance/calculateVehicleEfficency())));
        fuelTank.setTankCapacity(fuelRemaining);
    }


}
