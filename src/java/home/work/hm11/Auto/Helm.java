package home.work.hm11.Auto;

public class Helm {

    private double diskDiameter;
    private String material;

    public Helm() {

        diskDiameter = HelpTools.rnd(6, 10);
        String[] typeOfMaterial = {"lather", "alcantara"};
        material = typeOfMaterial[HelpTools.rnd(0, 1)];

    }


    @Override
    public String toString() {
        return "Helm{" +
                "diskDiameter=" + diskDiameter +
                ", material='" + material + '\'' +
                '}';
    }
}
