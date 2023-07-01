package vertiefende_aufgaben.aufgabe_01;

import java.util.LinkedList;
import java.util.Optional;

public class Ausgabebuch {
    private final LinkedList<Shop> shops;

    public Ausgabebuch() {
        this.shops = new LinkedList<>();
    }



    public void add(String shopName, String subjectName, float price) {
        Shop newShop = new Shop(shopName);
        newShop.addSubject(new Subject(subjectName, price));
        Optional<Shop> oldShop = shops.stream()
                .filter(s -> s.getName().equals(newShop.getName()))
                .findFirst();
        if (oldShop.isPresent()) {
            int index = this.shops.indexOf(oldShop);
            if (index != -1) {
                this.shops.set(this.shops.indexOf(index), newShop);
            }

        } else {
            this.shops.add(newShop);
        }

        System.out.println("Hinzugefügt zum Shop " + shopName + " in der Kategorie " + subjectName + ": " + price + "€");
    }


    public void reportShop() {
        if (!shops.isEmpty()) {
            for (Shop shop : shops) {
                System.out.println(shop.getName() + ": " + getCosts(shop.getName()));
            }
        }
    }

    private float getCosts(String name) {
        float sum = 0f;
        for (Shop shop : shops) {
            if (shop.getName().equals(name) && !shop.getSubjects().isEmpty()) {
                for (Subject subject : shop.getSubjects()) {
                    sum += subject.getPrice();
                }
            }
        }
        return sum;
    }
}
