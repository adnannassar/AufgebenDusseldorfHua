package vertiefende_aufgaben.aufgabe_01;

public class VortiefendeAufgabe_001 {
    public static void main(String[] args) {
        Ausgabebuch ausgabebuch = new Ausgabebuch();
        ausgabebuch.add("Aldi",  "Lebensmittel", 29.30f);
        ausgabebuch.add("Durstbunker",  "Lebensmittel", 37.30f);
        ausgabebuch.add("Edeka",  "Lebensmittel", 48.33f);
        ausgabebuch.add("Steam",  "Computerspiele", 29.99f);
        ausgabebuch.add("Amazon",  "Haushaltsartikel", 6.67f);
        ausgabebuch.add("Amazon",  "Computerspiele", 38.99f);
        ausgabebuch.reportShop();
    }
}
