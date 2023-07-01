package Coupling;

public class TightCoupling {
    static class Engine {
        void start() {
            System.out.println("Engine starting.. ");
        }
    }

    static class Car {
        Engine engine = new Engine();

        void startEngine() {
            engine.start();
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.startEngine();
        car2.startEngine();
    }

}
