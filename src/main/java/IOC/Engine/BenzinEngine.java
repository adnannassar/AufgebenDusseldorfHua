package IOC.Engine;

public class BenzinEngine implements Engine {
    @Override
    public void startCar() {
        System.out.println("Start Car using Benzin Engine");
    }
}
