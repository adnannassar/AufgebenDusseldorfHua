package vertiefende_aufgaben.aufgabe_01;

import java.util.LinkedList;
import java.util.Optional;


public class Shop {
    private final String name;
    private final LinkedList<Subject> subjects;


    public void addSubject(Subject newSubject) {
        if (newSubject != null) {
            Optional<Subject> oldSubject = subjects.stream()
                    .filter(s -> s.getName().equals(newSubject.getName()))
                    .findFirst();
            if (oldSubject.isPresent()) {
                oldSubject.get().updatePrice(newSubject.getPrice());
            } else {
                this.subjects.add(newSubject);
            }
        }
    }

    public Shop(String name) {
        this.name = name;
        this.subjects = new LinkedList<>();
    }

    public String getName() {
        return name;
    }



    public LinkedList<Subject> getSubjects() {
        return subjects;
    }


}
