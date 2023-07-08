package IOC.Patteren.LooseCoupling;

import IOC.Engine.ElectricEngine;
import IOC.Engine.EngineFactory;
import IOC.Engine.EngineType;
import IOC.Speakers.BoseSpeakers;
import IOC.Speakers.Speaker;
import IOC.Speakers.SpeakerFactory;
import IOC.Speakers.SpeakerType;
import IOC.Tires.MichelinTires;
import IOC.Tires.Tire;
import IOC.Tires.TireFactory;
import IOC.Tires.TireType;

public class LooseCoupling {
    public static void makeCar(SpeakerType speakerType, TireType tireType, EngineType engineType) {
        if (speakerType != null) {
            SpeakerFactory.createSpeaker(speakerType).makeSound();
        }

        if (tireType != null) {
            TireFactory.makeTire(tireType).rotate();
        }

        if (engineType != null) {
            EngineFactory.makeEngine(engineType).startCar();
        }
    }

    public static void makeCar(EngineType engineType) {
        if (engineType != null) {
            EngineFactory.makeEngine(engineType).startCar();
        }

    }
}
