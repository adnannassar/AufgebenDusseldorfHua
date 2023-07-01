package LiskovSubstitiionPriciple;

public class Liskov {

}

class Bird {
    void fly() throws Exception {
        System.out.println("Bird fly");
    }
}

class duck extends Bird{
    @Override
    void fly() {
        System.out.println("Duck fly");
    }
}

class Penguin extends Bird{
    @Override
    void fly() throws Exception {
       throw  new Exception("Penguin can't fly");
    }
}
