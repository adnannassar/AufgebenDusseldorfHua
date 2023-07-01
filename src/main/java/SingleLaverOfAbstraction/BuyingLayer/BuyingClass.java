package SingleLaverOfAbstraction.BuyingLayer;

import java.util.Arrays;
import java.util.LinkedList;

public class BuyingClass {

    public static boolean buy() {
        double budget = 30.50;
        LinkedList<String> things = new LinkedList<>(Arrays.asList(
                "EGG", "Butter", "Salt"
        ));

        double summe = 0.0;
        for (String str : things) {
            summe += 5;
        }

        if (summe <= budget) {
            System.out.println("Yes, we will eat!");
            return true;
        } else {
            System.out.println("No, we cant eat");
            return false;
        }
    }
}
