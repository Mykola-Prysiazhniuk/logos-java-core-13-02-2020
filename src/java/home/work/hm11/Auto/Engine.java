package home.work.hm11.Auto;

public class Engine {

    private int cylinders;

    public Engine() {
        cylinders = HelpTools.rnd(2, 6);

    }


    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                '}';
    }

}
