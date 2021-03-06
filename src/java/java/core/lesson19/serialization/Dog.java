package java.core.lesson19.serialization;

import java.io.Serializable;

public class Dog implements Serializable {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public Dog() {
    }
}
