package java.core.lesson13;

public class Cat implements Comparable<Cat> {

    private String name;
    private int age;
    private int strength;

    public Cat(String name, int age, int strength) {
        this.name = name;
        this.age = age;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", strength=" + strength +
                '}';
    }

    @Override
    public int compareTo(Cat otherCat) {
        if (this.getAge() > otherCat.getAge()){
            return 1;
        }
        if (this.getAge()< otherCat.getAge()){
            return -1;
        }
        return 0;
    }
}
