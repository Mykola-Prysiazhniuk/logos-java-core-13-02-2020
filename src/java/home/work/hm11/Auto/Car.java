package home.work.hm11.Auto;

import java.util.Random;

public class Car {


    private int horsePower;
    private int graduatationYear;
    private Helm helm;
    private Engine engine;

    public Car(Engine engine, Helm helm){
        horsePower = HelpTools.rnd(100,500);
        graduatationYear = HelpTools.rnd(1990, 2020);
        this.engine = engine;
        this.helm = helm;

    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                ", graduatationYear=" + graduatationYear +
                ", helm=" + helm +
                ", engine=" + engine +
                '}';
    }
}
