package lessons04;

import java.core.lessons03.Person;

public class Application {
    public static void main(String[] args) {

        Horse h1 = new Horse(1.5);
        System.out.println(h1);
        h1.run();
        h1.speak();

        Pegasus h2 = new Pegasus(2.5,3.5);
        System.out.println(h2);
        h2.fly();
        h2.run();
        h2.speak();
        System.out.println(h2.getColor());



    }
}
