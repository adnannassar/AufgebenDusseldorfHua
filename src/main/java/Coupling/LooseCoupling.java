package Coupling;

public class LooseCoupling {


    interface Engine {
        void start();
    }

    static class BenzinEngine implements Engine {
        @Override
        public void start() {
            System.out.println("Starting Benzin Engine!");
        }
    }

    static class DieselEngine implements Engine {
        @Override
        public void start() {
            System.out.println("Starting Diesel Engine!");
        }
    }


    static class Car {
        Engine engine;

        public Car(Engine engine) {
            this.engine = engine;
        }

        void startEngine() {
            engine.start();
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }
    }

    public static void main(String[] args) {
        Car car = new Car(new BenzinEngine());
        car.startEngine();
        System.out.println("Car Engine changed!");
        car.setEngine(new DieselEngine());
        car.startEngine();

    }
}
