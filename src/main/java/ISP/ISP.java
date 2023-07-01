package ISP;

public class ISP {


}

interface Swim {
    void swim();

}

interface Fly {
    void fly();
}

interface Activity extends Swim, Fly{

}


class Duck implements Activity {
    @Override
    public void swim() {
        System.out.println("Duck swim");
    }

    @Override
    public void fly() {
        System.out.println("Duck fly");
    }
}

class Penguin implements Swim {
    @Override
    public void swim() {
        System.out.println("Penguin swim");

    }
}
