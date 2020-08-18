package lessons12;

import lessons11.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraysListExample {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Text");
        list1.add(123);

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("123");
        list2.add("qwertyu");
        System.out.println("List2 is " + list2);
        list2.add(1, "New");
        System.out.println("List2 after add to Index: " + list2);

        System.out.println(list2.size());

        list2.sort(Collections.reverseOrder());
        System.out.println(list2);

        list1.add(list2);
        System.out.println(list1);


        System.out.println(list1.contains("Maria"));

        list1.add("New");
        list1.add("New");
        System.out.println(list1.indexOf("New"));
        System.out.println(list1.lastIndexOf("New"));


        list1.removeAll(list2);
        System.out.println(list1);

    }
}
