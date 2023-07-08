package IOC.Engine;

public class EngineFactory {

    public static Engine makeEngine(EngineType engineType) {
        if (engineType == null) {
            return null;
        }
        if(engineType.equals(EngineType.BENZIN)){
            return new BenzinEngine();
        }
        else if(engineType.equals(EngineType.DIESEL)){
            return new DieselEngine();
        }
        else if(engineType.equals(EngineType.ELECTRIC)){
            return new ElectricEngine();
        }
        return  null;
    }
}
