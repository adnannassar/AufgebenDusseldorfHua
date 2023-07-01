package LOD_Low_Of_Demeter;

public class Example {
    public static void main(String[] args) {

    }

    interface Woerterbuch {
        boolean enthaelt(String wort);

        int size();
    }

    class Checker {
        private final Woerterbuch woerterbuch;
        private Buchsammlung sammlung;

        public Checker(Buchsammlung sammlung) {
            this.woerterbuch = getWoerterbuch("WildesWortWerk");
        }

        private Woerterbuch getWoerterbuch(String param){
            return this.sammlung.get(param);
        }

        public boolean satzKorrekt(String satz) {
            for (String wort : satz.split("")) {
                if (!woerterbuch.enthaelt(wort)) {
                    return false;
                }
            }
            return true;
        }
    }

    class Buchsammlung {
      public Woerterbuch get(String name){
          return new x();
      }
    }

    class x implements Woerterbuch{

        @Override
        public boolean enthaelt(String wort) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }
    }
}

