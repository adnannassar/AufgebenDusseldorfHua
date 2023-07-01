package LOD_Low_Of_Demeter;

public class LOD_Wrong {
    static class Wallet {
        private int money;

        public Wallet(int money) {
            this.money = money;
        }

        public int getMoney() {
            return money;
        }
    }

    static class Person {
        private Wallet wallet;

        public Person(Wallet wallet) {
            this.wallet = wallet;
        }

        public Wallet getWallet() {
            return wallet;
        }
    }


    public static void main(String[] args) {
        Person p = new Person(new Wallet(100));
        int money = p.getWallet().getMoney();
        System.out.println(money);
    }

}
