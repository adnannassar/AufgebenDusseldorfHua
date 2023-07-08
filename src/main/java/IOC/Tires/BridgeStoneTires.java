package IOC.Tires;

public class BridgeStoneTires extends Tire {
    public BridgeStoneTires() {
    }

    @Override
    public void rotate() {
        System.out.println("Rotating using BridgeStoneTires");
    }
}
