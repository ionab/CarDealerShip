package vehicles;
import components.Engine;



public class Car extends Vehicle implements Driveable{

    Engine engine;
    int distance;

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

    public boolean drive(double distance){

        return true;
//        (calculateVehicleEfficency()*distance);

    }


}
