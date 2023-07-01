package CodeSmells;

import java.util.Arrays;
import java.util.LinkedList;

interface CodeSmell {
    void example();
}


abstract class CodeSmellExample implements CodeSmell {
    protected String name;

    public CodeSmellExample(String name) {
        this.name = name;
    }
}


public class Main {
    public static void main(String[] args) {
        LinkedList<CodeSmell> codeSmells = new LinkedList<>(Arrays.asList(
                new CodeSmellExample("Large Class:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell arises when a class is doing too much. It can be solved by breaking down the class into smaller, more focused classes.");
                    }
                },
                new CodeSmellExample("Long Method:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell occurs when a method is excessively long and complex. It can be fixed by refactoring the method, often by breaking it down into smaller, more understandable methods.");
                    }
                },
                new CodeSmellExample("Feature Envy:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell happens when a method is more interested in a class other than the one it actually is in. It can be resolved by moving the method to the class it is most interested in.");
                    }
                },
                new CodeSmellExample("Data Clumps:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell arises when you have data that always hangs around together. It can be resolved by combining the data clump into a class.");
                    }
                },
                new CodeSmellExample("Primitive Obsession:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell occurs when primitive types are used excessively instead of small objects for simple tasks. It can be resolved by using value objects that contain the primitives.");
                    }
                },
                new CodeSmellExample("Switch Statement:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell occurs when you have a complex switch statement or a sequence of if statements. It can be refactored using polymorphism to remove these statements.");
                    }
                },
                new CodeSmellExample("Temporary Field:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell arises when an object's class has a field that isn't always used. It can be resolved by creating a separate class for the times when the field is required.");
                    }
                },
                new CodeSmellExample("Divergent Change:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell occurs when one class is commonly changed in different ways for different reasons. It can be resolved by splitting the class into separate classes such that each class handles each reason for change.");
                    }
                },
                new CodeSmellExample("Shotgun Surgery:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell arises when a single change leads to multiple changes in a variety of classes. It can be resolved by moving the methods to a class that encapsulates the changes.");
                    }
                },
                new CodeSmellExample("Lazy Class or Freeloader:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell occurs when a class doesn't do enough to earn its keep. It can be resolved by collapsing the class, or merging it with another class.");
                    }
                },
                new CodeSmellExample("Message Chain:") {
                    @Override
                    public void example() {
                        System.out.println(name + " This smell occurs when a client requests another object, that object requests another one, and so on. These chains mean that the client is dependent on navigation along the class structure. Can be resolved by delegating the call to the appropriate class directly.");
                    }
                }
        ));
        int i = 1;
        System.out.println();
        for (CodeSmell codeSmell : codeSmells) {
            System.out.print(i++ + ".");
            codeSmell.example();
            System.out.println();
        }
    }
}
