package IOC.Engine;

public class DieselEngine implements Engine {
    @Override
    public void startCar() {
        System.out.println("Start Car using Diesel Engine");
    }
}
