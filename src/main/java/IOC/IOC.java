package IOC;

import IOC.Engine.EngineType;
import IOC.Patteren.LooseCoupling.LooseCoupling;
import IOC.Speakers.SpeakerType;

import IOC.Tires.TireType;

public class IOC {
    public static void main(String[] args) {
        // TightCoupling.makeCar();
        LooseCoupling.makeCar(SpeakerType.SONY, TireType.MICHELIN, EngineType.BENZIN);
        LooseCoupling.makeCar(EngineType.ELECTRIC);
    }
}
