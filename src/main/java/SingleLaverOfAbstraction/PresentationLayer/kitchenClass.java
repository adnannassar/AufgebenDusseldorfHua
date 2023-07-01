package SingleLaverOfAbstraction.PresentationLayer;

import SingleLaverOfAbstraction.BuyingLayer.BuyingClass;
import SingleLaverOfAbstraction.CockingLayer.CockingClass;
import SingleLaverOfAbstraction.EatingLayer.EatingClass;
import SingleLaverOfAbstraction.PreparingLayer.PreparingClass;

public class kitchenClass {

    public static void main(String[] args) {
        makeFood();
    }

    public static void makeFood() {
        if (BuyingClass.buy()) {
            PreparingClass.prepare();
            CockingClass.cock();
            EatingClass.eat();
        }
    }
}
