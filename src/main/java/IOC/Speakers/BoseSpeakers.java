package IOC.Speakers;

public class BoseSpeakers implements Speaker {
    public BoseSpeakers() {
    }

    @Override
    public void makeSound() {
        System.out.println("Sound using SONY!");
    }
}
