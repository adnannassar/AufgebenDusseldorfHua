package SRP_Single_Responsibility;

public class SRP_Single_Responsibility_Correct {

    static class Mitarbeiter {
        private String name;
        private String address;
        private double gehalt;

        // constructor setter and getter

        public double berechneJahresgehalt() {
            // logic here
            return gehalt * 12;
        }



    }

    static class DBManagement{
        public void saveMitarbeiterInDatenbank(Mitarbeiter mitarbeiter) {
            // logic here
        }
    }
}
