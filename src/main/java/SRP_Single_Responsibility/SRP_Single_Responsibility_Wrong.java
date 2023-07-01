package SRP_Single_Responsibility;

public class SRP_Single_Responsibility_Wrong {

    static class Mitarbeiter {
        private String name;
        private String address;
        private double gehalt;


        public double berechneJahresgehalt() {
            // logic here
            return gehalt * 12;
        }

        public void saveMitarbeiterInDatenbank() {
            // logic here
        }

        public Mitarbeiter(String name, String address, double gehalt) {
            this.name = name;
            this.address = address;
            this.gehalt = gehalt;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public double getGehalt() {
            return gehalt;
        }

        public void setGehalt(double gehalt) {
            this.gehalt = gehalt;
        }


    }
}
