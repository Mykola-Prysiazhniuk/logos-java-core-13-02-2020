package lessons04;

public class Pegasus extends Horse {

    private double wingsQuantity;

    public Pegasus(double wingsQuantity, double legsQuantity){
        this.wingsQuantity = wingsQuantity;
        this.legsQuantity = legsQuantity;
    }

    public void fly(){
        System.out.println("I believe, i can fly!");
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Pegasus{" +
                "wingsQuantity=" + wingsQuantity +
                ", legsQuantity=" + legsQuantity +
                ", color='" + color + '\'' +
                '}';

    }
}
