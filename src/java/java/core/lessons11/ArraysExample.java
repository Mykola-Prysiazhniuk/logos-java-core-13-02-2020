package java.core.lessons11;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("array1: " + Arrays.toString(array1));

        int[][] array2 = {{2, 3, 4}, {5, 6, 7}};
        System.out.println("array2: " + Arrays.deepToString(array2));

        int[][][] array3 = new int[2][3][4];
        System.out.println("array3: " + Arrays.deepToString(array3));

        Person p1 = new Person("Dmytro");
        Person p2 = new Person("Mike");
        Person p3 = new Person("Artur");

        Person[] personArray = {p1, p2, p3};
        System.out.println("array3: " + Arrays.deepToString(personArray));

       boolean[] array4 = new boolean[7];
        System.out.println("array4: " +Arrays.toString(array4));
        Arrays.fill(array4, true);
        System.out.println("array4 after fill: " +Arrays.toString(array4));

        boolean[] array5 = new boolean[7];
        System.out.println("array5: " + Arrays.toString(array5));

        System.out.println("Is array4 equals array5: " + Arrays.equals(array4,array5));

        int[] array6 = {1,34,567,2,89,5,0,56};
        System.out.println("array6: " + Arrays.toString(array6));


    }
}
