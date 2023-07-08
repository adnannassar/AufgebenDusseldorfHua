package IOC.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void startCar() {
        System.out.println("Start Car using Electric Engine");
    }
}
