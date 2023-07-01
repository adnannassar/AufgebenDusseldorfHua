package vertiefende_aufgaben.aufgabe_01;

public class Subject {
    private final String name;
    private float price;

    public Subject(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }



    public float getPrice() {
        return price;
    }


    public void updatePrice(float price) {
        this.price += price;
    }

    @Override
    public String toString() {
      return name + " " + price;
    }
}
