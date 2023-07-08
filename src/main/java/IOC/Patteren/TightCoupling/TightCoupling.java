package IOC.Patteren.TightCoupling;

import IOC.Speakers.BoseSpeakers;
import IOC.Tires.MichelinTires;

public class TightCoupling {
    public static void makeCar() {
        BoseSpeakers boseSpeakers = new BoseSpeakers();
        boseSpeakers.makeSound();

        MichelinTires michelinTires = new MichelinTires();
        michelinTires.rotate();
    }
}
