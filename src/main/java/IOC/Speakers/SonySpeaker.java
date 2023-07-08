package IOC.Speakers;

public class SonySpeaker implements Speaker  {
    @Override
    public void makeSound() {
        System.out.println("Sound using SONY!");
    }
}
