package java.core.lessons03;

public class Person {
    private String name;
    private String number;

    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){ return name; }

    public void setName(String name){ this.name = name; }

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }

    public void callOtherPerson(Person otherPerson){
        System.out.println("Ні, " + otherPerson.getName() + ". It is " + this.name);
    }





}
