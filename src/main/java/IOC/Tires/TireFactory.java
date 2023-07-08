package IOC.Tires;

public class TireFactory {
    public static Tire makeTire(TireType type) {
        if (type == null) {
            return null;
        }
        if (type.equals(TireType.BRIDGESTONE)) {
            return new BridgeStoneTires();
        }else if(type.equals(TireType.MICHELIN)){
            return new MichelinTires();
        }
        return null;
    }
}
