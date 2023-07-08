package IOC.Tires;

public class MichelinTires extends Tire {
    @Override
    public void rotate() {
        System.out.println("Rotating using MichelinTires");
    }
}
